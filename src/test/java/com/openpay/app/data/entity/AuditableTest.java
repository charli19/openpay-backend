//package com.openpay.app.data.entity;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//import java.util.Date;
//
//import org.junit.Test;
//
//public class AuditableTest {
//
//	public void WhenInstantiateAuditableThenObjectIsNotNull() {
//		
//		Auditable auditable = new Auditable();
//
//		assertNotNull(auditable);
//	}
//
//	@Test
//	public void WhenSetStringsThenGettersEqualsToSetters() {
//		
//		Auditable auditable = new Auditable();
//		Date createdDate = new Date();
//		Date lastModifiedDate = new Date();
//		
//		auditable.setCreatedBy("createdBy");
//		auditable.setCreatedDate(createdDate);
//		auditable.setLastModifiedBy("lastModifiedBy");
//		auditable.setLastModifiedDate(lastModifiedDate);
//
//		assertEquals("createdBy", auditable.getCreatedBy());
//		assertEquals(createdDate, auditable.getCreatedDate());
//		assertEquals("lastModifiedBy", auditable.getLastModifiedBy());
//		assertEquals(lastModifiedDate, auditable.getLastModifiedDate());
//	}
//	
//}
