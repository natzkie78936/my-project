sentence = input("Enter sentence: ")
vowel = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
boolean = True

while boolean:
    choice = int(input(
        "\nChoose an operation:\n"
        "1. Reverse the sentence\n"
        "2. Count vowels\n"
        "3. Check if palindrome\n"
        "4. Find and replace a word\n"
        "5. Format (Title case)\n"
        "6. Split into words\n"
        "7. Word frequency counter\n"
        "8. Swap case\n"
        "9. Exit\n"
    ))

    if choice == 1:
        def reverse(s):
            return " ".join(s.split()[::-1])
        print("Here is your reversed sentence:", reverse(sentence))

    elif choice == 2:
        count = sum(1 for letter in sentence if letter in vowel)
        print("Vowel count:", count)

    elif choice == 3:
        words = sentence.split()
        result = {word: (word.lower() == word.lower()[::-1]) for word in words}
        print("Palindromes:", result)

    elif choice == 4:
        find_word = input("Enter the word to find: ")
        if find_word not in sentence.split():
                print("Word not found")
        else:
            replace_word = input("Enter the word to replace it with: ")
            sentence = sentence.replace(find_word, replace_word)
            print("Updated sentence:", sentence)

    elif choice == 5:
        print("Title case:", sentence.title())

    elif choice == 6:
        print("Words:", sentence.split())

    elif choice == 7:
        freq = {}
        for word in sentence.split():
            freq[word] = freq.get(word, 0) + 1
        print("Word frequency:", freq)

    elif choice == 8:
        print("Swapped case:", sentence.swapcase())

    elif choice == 9:
        print("Exiting program.")
        boolean = False

    else:
        print("Invalid choice. Please try again.")
