.data 
str0: .asciiz "Welcome to BobCat Candy, home to the famous BobCat Bars!"
# Declare any necessary data here
price: .asciiz "\nPlease the price of a BabCat Bar:\n"
wrapper: .asciiz "Please enter the number of wrappers needed to exchange for a new bar:\n"
money: .asciiz "How much money do you have?\n"
str1: .asciiz "Good! Let me run the number ... \n"
initial: .asciiz "You first buy "
new: .asciiz "Then, you will get another "
end1: .asciiz "With $"
end2: .asciiz ", you will recieve a maximum of "
end3: .asciiz " BobCat Bars!\n"
bars: .asciiz " bars\n"
.text

main:
		#This is the main program.
		#It first asks user to enter the price of each BobCat Bar.
		#It then asks user to enter the number of bar wrappers needed to exchange for a new bar.
		#It then asks user to enter how much money he/she has.
		#It then calls maxBars function to perform calculation of the maximum BobCat Bars the user will receive based on the information entered. 
		#It then prints out a statement about the maximum BobCat Bars the user will receive.
		
		addi $sp, $sp -4	# Feel free to change the increment if you need for space.
		sw $ra, 0($sp)
		# Implement your main here
		#set min to $t0
		addi $t0, $zero, 1
		
		#Display intro
		li $v0, 4
		la $a0, str0
		syscall
		
		#Prompt user to enter price
		li $v0, 4
		la $a0, price
		syscall
		
		#Get price from user
		li $v0, 5
		syscall
		
		#Store price in $s0
		move $s0, $v0
		
		#Prompt user to enter number of wrappers for exchange
		li $v0, 4
		la $a0, wrapper
		syscall
		
		#Get number of wrappers for exchange
		li $v0, 5
		syscall
		
		#Store number of wrappers for exchange in $s1
		move $s1, $v0
		
		#Prompt user to enter amount of money they have
		li $v0, 4
		la $a0, money
		syscall
		
		#Get amount from user
		li $v0, 5
		syscall
		
		#Store mount in $s3
		move $s3, $v0
		
		#Display str1
		li $v0, 4
		la $a0, str1
		syscall
		
		#Calculate how many bars user will get from money
		div $s4, $s3, $s1
		
		#set totalbars = 0
		add $s5, $zero, $zero
		
		#add intial bars to total bars
		add $s5, $s5, $s4
		
		#Display initial
		li $v0, 4
		la $a0, initial
		syscall
		
		#Display intial bars
		li $v0, 1
		la $a0, ($s4)
		syscall
		
		#Display bars
		li $v0, 4
		la $a0, bars
		syscall

		jal maxBars 	# Call maxBars to calculate the maximum number of BobCat Bars

		# Print out final statement here



		j end			# Jump to end of program



maxBars:
		# This function calculates the maximum number of BobCat Bars.
		# It takes in 3 arguments ($a0, $a1, $a0) as n, price, and money. It returns the maximum number of bars

			while:
			ble $s4, 1, exit
			add $t1, $zero, $s4
			jal newBars 	# Call a helper function to keep track of the number of bars.
			
			add $s5, $s5, $s4
			
			#display new
			li $v0, 4
			la $a0, new
			syscall
			
			#display new bars
			li $v0, 1
			la $a0, ($s4)
			syscall
			
			#display bars
			li $v0, 4
			la $a0, bars
			syscall
			
			j while
	
			exit:
			li $v0, 4
			la $a0, end1
			syscall
			
			li $v0, 1
			la $a0, ($s3)
			syscall
			
			li $v0, 4
			la $a0, end2
			syscall
			
			li $v0, 1
			la $a0, ($s5)
			syscall
			
			li $v0, 4
			la $a0, end3
			syscall
			
			jr $ra
		# End of maxBars
		jr $ra

newBars:
		# This function calculates the number of BobCat Bars a user will receive based on n.
		# It takes in 2 arguments ($a0, $a1) as number of bars so far and n.

		
		div $s4, $t1, $s1
		
		
		
		jr $ra
		# End of newBars

end: 
		# Terminating the program
		lw $ra, 0($sp)
		addi $sp, $sp 4
		li $v0, 10 
		syscall
