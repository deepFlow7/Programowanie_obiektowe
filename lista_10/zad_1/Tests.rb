require_relative 'Sorter'

s = Sorter.new

c1 = Collection.new
10.times{ c1.add(Random.rand(150)) } 
print "collection 1 : " + c1.to_s + "\n"
s.sort1(c1)
print "After sort : " + c1.to_s + "\n\n"

c2 = Collection.new
10.times{ c2.add(Random.rand(150)) } 
print "collection 2 : " + c2.to_s + "\n"
s.sort2(c2)
print "After sort : " + c2.to_s + "\n\n"

