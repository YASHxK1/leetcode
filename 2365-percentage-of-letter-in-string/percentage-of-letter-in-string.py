class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        #print(len(s))
        letter_count:int = s.count(letter)
        #print(letter_count)
        percentage:int = float(letter_count) / float(len(s)) * 100
        return int(percentage)

        