@smoke
Feature:  F1
 Scenario:  make search with "car accessories " ,add items to cart
         Given Open amazon link https://www.amazon.com/
         When  Write in SearchBar  car accessories
         Then  Select the first Item,index 0
         And   Add item to the car
         And   Check item add successful


