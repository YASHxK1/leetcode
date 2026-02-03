class Solution:
    def convertTemperature(self, celsius: float) -> List[float]:
        Fahrenheit:float = celsius * 1.80 + 32.00
        kel:float = celsius + 273.15

        return kel,Fahrenheit
        