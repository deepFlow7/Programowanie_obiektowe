require_relative 'Szyfr'

key = 
    { 
    'a' => 'b',
    'b' => 'r',
    'c' => 'd',
    'd' => 'c',
    'e' => 'f',
    'f' => 'g',
    'g' => 'h',
    'i' => 'j',
    'j' => 'k',
    'k' => 'l',
    'l' => 'm',
    'm' => 'n',
    'n' => 'o',
    'o' => 'p',
    'p' =>  's',
    's' => 't',
    't' => 'v',
    'v' => 'w',
    'w' => 'x',
    'x' => 'z',
    'z' => 'e',
    'r' => 'y',
    'y' => 'u',
    'u' => 'a'
    }

j = Jawna.new("szyfrprzestawieniowy")
print "Do zaszyfrowania : #{j.to_s} \n"

z = j.zaszyfruj(key)
print "Zaszyfrowane : #{z.to_s} \n"

o = z.oszyfruj(key)
print "Odszyfrowane : #{o.to_s} \n"