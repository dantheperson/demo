package net.dantheperson;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductEntity {
	boolean isActive;
}