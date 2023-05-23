require_relative 'Node'

class Collection
    def initialize
        @list = nil
        @length = 0
    end

    def length
        @length
    end

    def get(i)
        if i < 0 || i >= @length
             return nil
        end
        current = @list
        while i > 0
            i -= 1
            current = current.next
        end
        unless current.kind_of?(Node)
            current.list.val
        else
            current.val
       
        end
    end

    def list
        @list
    end

    def add(value)
        @length += 1
        if @list == nil
            @list = Node.new(value)
        else 
            if @list.val <= value
                list_temp = Collection.new
                if @list.next != nil
                    list_temp.add(@list.next.val)
                    list_temp.set_next(@list.next.next)
                end
                list_temp.add(value)
                list_temp.list.set_prev(@list) 
                
                @list.set_next(list_temp)
            else
                    new_node = Node.new(value)
                    node_temp = @list.prev
                    @list.set_prev(new_node)
                    new_node.set_next(@list)
                    new_node.set_prev(node_temp)
                    @list= new_node
            end
        end
    end
end

