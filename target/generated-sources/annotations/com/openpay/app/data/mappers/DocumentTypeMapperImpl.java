package com.openpay.app.data.mappers;

import com.openpay.app.data.apimodel.DocumentTypeBean;
import com.openpay.app.data.entity.DocumentType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-10T23:41:36+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
@Component
public class DocumentTypeMapperImpl implements DocumentTypeMapper {

    @Override
    public DocumentTypeBean mapToBean(DocumentType documentType) {
        if ( documentType == null ) {
            return null;
        }

        DocumentTypeBean documentTypeBean = new DocumentTypeBean();

        documentTypeBean.setId( documentType.getId() );
        documentTypeBean.setName( documentType.getName() );

        return documentTypeBean;
    }

    @Override
    public List<DocumentTypeBean> mapToBeanList(List<DocumentType> documentTypeList) {
        if ( documentTypeList == null ) {
            return null;
        }

        List<DocumentTypeBean> list = new ArrayList<DocumentTypeBean>( documentTypeList.size() );
        for ( DocumentType documentType : documentTypeList ) {
            list.add( mapToBean( documentType ) );
        }

        return list;
    }

    @Override
    public DocumentType mapToEntity(DocumentTypeBean documentTypeBean) {
        if ( documentTypeBean == null ) {
            return null;
        }

        DocumentType documentType = new DocumentType();

        documentType.setId( documentTypeBean.getId() );
        documentType.setName( documentTypeBean.getName() );

        return documentType;
    }

    @Override
    public List<DocumentType> mapToEntityList(List<DocumentTypeBean> documentTypeBeans) {
        if ( documentTypeBeans == null ) {
            return null;
        }

        List<DocumentType> list = new ArrayList<DocumentType>( documentTypeBeans.size() );
        for ( DocumentTypeBean documentTypeBean : documentTypeBeans ) {
            list.add( mapToEntity( documentTypeBean ) );
        }

        return list;
    }
}
