
def start():
 
print("The Knowledge Quest Challenge!")
 
choice = input("Enter 'E' to start or 'X' to quit: ")
 
if choice.lower() == 'e':
 
print("Let's Start!")
 
questions = {
 
"What year did G-Dragon debut as a solo artist?": "2009",
 
"What is the name of the K-pop group that G-Dragon is a member of?": "Bigbang",
 
"What is the nickname G-Dragon is often referred to as, due to his influence in both music and fashion?": "King of kpop",
 
"What is the name of the hit song by G-Dragon from his 2009 solo debut album 'Heartbreaker'?": "Heartbreaker",
 
"What is G-Dragon's fashion brand name?": "Peaceminusone"
 
}
 
score = 0
 
attempts = 3
 
for qtn, answer in questions.items():
 
current_attempts = attempts
 
while current_attempts > 0:
 
print(qtn)
 
user_answer = input("Your answer: ")
 
if user_answer.lower() == answer.lower():
 
print("Correct!")
 
score += 1
 
break
 
else:
 
current_attempts -= 1
 
print(f"Incorrect. You have {current_attempts} attempt(s) left.")
 
if current_attempts == 0:
 
print(f"The correct answer was: {answer}")
 
print(f"\nYour final score: {score}/{len(questions)}")
 
if score == len(questions):
 
print("Congratulations! You just won the Knowledge Quest Challenge!")
 
else:
 
print("Better luck next time!")
 
elif choice.lower() == 'x': 
 
print("Quitting...")
 
else:
 
print("Invalid choice. Please enter 'e' or 'x'.")
start()