package com.Riwi.LastFilter.infrastructure.abstract_services;

import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.Create;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.Delete;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.GetAll;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.ReadById;
import com.Riwi.LastFilter.infrastructure.abstract_services.HTTPGenerics.Update;

public interface IProductService extends GetAll<ProductResponse> {
    
}
