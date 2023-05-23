class Node
    def initialize(val)
        @val = val
        @prev = nil
        @next = nil
    end

    def set_prev(node)
        @prev = node
    end

    def set_next(node)
        @next = node
    end

    def val
        @val
    end

    def next
        @next
    end

    def prev
        @prev
    end
end