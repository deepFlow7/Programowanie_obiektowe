class Collection
    def initialize
        @array = Array.new
    end

    def add(value)
        @array.push(value)
    end

    def length
        @array.length
    end

    def get(i)
        if i < 0 || i >= @array.length
            nil
        else
            @array[i]
        end
    end

    def swap(i,j)
        if get(i) != nil && get(j) != nil
            temp = get(i)
            @array[i] = @array[j]
            @array[j] = temp
        end
    end

    def to_s
        @array.to_s
    end
end