def two_natural_mult(x, y, c=0):
    if y == 0: return c
    if y < 0: return two_natural_mult(x, y+1, c-x)
    if y > 0: return two_natural_mult(x, y-1, c+x)


def series_calc(n, acc=0):
    if n == 0: return acc
    if n > 0: return series_calc(n - 1, acc + 1/n)
    if n < 0: return series_calc(n + 1, acc + 1/n)


def inverte_string(palavra, idx=0):
    if idx== len(palavra)/2: return palavra
    else: return inverte_string(swap_chars(palavra, idx, len(palavra)-idx-1), idx+1)


def swap_chars(s, idx1, idx2):
    if idx1 == idx2:
        return s
    s_list = list(s)
    s_list[idx1], s_list[idx2] = s_list[idx2], s_list[idx1]
    return ''.join(s_list)


print(inverte_string("odnil initsuga"))