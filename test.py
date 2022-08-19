import numpy

arr = [2, 5, 6, 7, 9, 3, 4, 1, 0, 3]
print(f'в массиве {arr}')
i_max = 0
i_min = 0
i = 1
sum = 0
print(arr.index(max(arr)), arr.index(min(arr)))
while i < len(arr):
    if arr[i] > arr[i_max]:
        i_max = i

    if arr[i] < arr[i_min]:
        i_min = i
    i += 1
print(f'индекс минимального значения = {i_min}\nиндекс максимального значения = {i_max}')
while i_min + 1 < i_max:
    sum += arr[i_min + 1]
    i_min = i_min + 1

while i_min > i_max + 1:    
    sum += arr[i_max + 1]
    i_max = i_max + 1
print(f'сумма значений между минимальным и максимальным индексами = {sum}')


