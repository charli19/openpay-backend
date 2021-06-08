package com.openpay.app.data.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.openpay.app.data.apimodel.DocumentTypeBean;
import com.openpay.app.data.entity.DocumentType;

@Mapper(componentModel = "spring")
public interface DocumentTypeMapper {

	DocumentTypeBean mapToBean(DocumentType documentType);

	List<DocumentTypeBean> mapToBeanList(List<DocumentType> documentTypeList);

	DocumentType mapToEntity(DocumentTypeBean documentTypeBean);

	List<DocumentType> mapToEntityList(List<DocumentTypeBean> documentTypeBeans);
}
