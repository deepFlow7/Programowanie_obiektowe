require_relative 'Collection'
# sort1 w niektóryych przypadkach jest szybsze niż sort2 

class Sorter
    def sort1(collection)
        i = 0
        while i < collection.length
            j = 1
            swap = false
            while j < collection.length - i
                if collection.get(j-1) > collection.get(j)
                    collection.swap(j-1,j)
                    swap = true
                end
                j += 1
            end
            i += 1
            if swap == false
                return
            end
        end
    end

    def sort2(collection)
        i = 0
        while i < collection.length - 1
            j = i + 1
            min = i
            while j < collection.length 
                if collection.get(j) < collection.get(min)
                    min = j
                end
                j = j + 1
            end
            collection.swap(i,min)
            i += 1
        end
    end
end
