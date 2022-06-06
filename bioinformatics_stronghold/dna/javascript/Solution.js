const lines = prompt('Insert a DNA string of lenght at most 1000 nt:').split(' ');
let dna_str = lines[0].toLowerCase();
let a = (dna_str.match(/a/g) || []).length;
let c = (dna_str.match(/c/g) || []).length;
let g = (dna_str.match(/g/g) || []).length;
let t = (dna_str.match(/t/g) || []).length;

console.log(dna_str);
console.log(a,c,g,t);