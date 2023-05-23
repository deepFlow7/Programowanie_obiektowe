require_relative 'Searching'

n = Collection.new
n.add(5)
n.add(7)
n.add(1)
print "Length : " + n.length.to_s + "\n"
print "Values : " + n.get(0).to_s + " " + n.get(1).to_s + " " + n.get(2).to_s + "\n\n"

s = Searching.new
print "index of 5 in collection : " + s.binary_search(5,n).to_s + "\n" 
print "index of 11 in collection : " + s.binary_search(11,n).to_s + "\n" 
print "index of 7 in collection : " + s.interpolation_search(7,n).to_s + "\n" 
print "index of 22 in collection : " + s.interpolation_search(22,n).to_s + "\n" 