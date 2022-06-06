dna_str = input('Insert a DNA string of lenght at most 1000 nt:\n')
dna_str = dna_str.lower()

a = dna_str.count('a')
c = dna_str.count('c')
g = dna_str.count('g')
t = dna_str.count('t')

print(a, c, g, t)