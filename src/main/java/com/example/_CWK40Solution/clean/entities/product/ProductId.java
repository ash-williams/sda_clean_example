package com.example._CWK40Solution.clean.entities.product;
import com.example._CWK40Solution.clean.entities.product.exceptions.InvalidIdException;
import java.util.Objects;

public class ProductId
{
    private final long id;

    static final ProductId NONE = new ProductId();

    private ProductId()
    {
        id = 0;
    }

    public ProductId(long id) throws InvalidIdException {
        if(id <= 0)
        {
            throw new InvalidIdException(id);
        }
        this.id = id;
    }

    public long asLong() {
        return id;
    }

    public String asString() {
        return Long.toString(id);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductId productId = (ProductId) o;
        return id == productId.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return String.format("id:%d", id);
    }
}
