package com.wms.core.business.common.model.audit;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.wms.core.business.common.model.audit.AuditSection;
import com.wms.core.business.common.model.audit.Auditable;

public class AuditListener {
	
	@PrePersist
	@PreUpdate
	public void onSaveOrUpdate(Object o) {
		if (o instanceof Auditable) {
			Auditable audit = (Auditable) o;
			AuditSection auditSection = audit.getAuditSection();
			
			auditSection.setDateModified(new Date());
			if (auditSection.getDateCreated() == null) {
				auditSection.setDateCreated(new Date());
			}
			audit.setAuditSection(auditSection);
		}
	}
}
