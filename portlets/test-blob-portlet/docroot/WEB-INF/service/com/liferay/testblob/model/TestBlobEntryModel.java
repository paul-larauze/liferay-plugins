/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.testblob.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.sql.Blob;

/**
 * The base model interface for the TestBlobEntry service. Represents a row in the &quot;TestBlob_TestBlobEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.testblob.model.impl.TestBlobEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.testblob.model.impl.TestBlobEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestBlobEntry
 * @see com.liferay.testblob.model.impl.TestBlobEntryImpl
 * @see com.liferay.testblob.model.impl.TestBlobEntryModelImpl
 * @generated
 */
@ProviderType
public interface TestBlobEntryModel extends BaseModel<TestBlobEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a test blob entry model instance should use the {@link TestBlobEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this test blob entry.
	 *
	 * @return the primary key of this test blob entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this test blob entry.
	 *
	 * @param primaryKey the primary key of this test blob entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this test blob entry.
	 *
	 * @return the uuid of this test blob entry
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this test blob entry.
	 *
	 * @param uuid the uuid of this test blob entry
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the test blob entry ID of this test blob entry.
	 *
	 * @return the test blob entry ID of this test blob entry
	 */
	public long getTestBlobEntryId();

	/**
	 * Sets the test blob entry ID of this test blob entry.
	 *
	 * @param testBlobEntryId the test blob entry ID of this test blob entry
	 */
	public void setTestBlobEntryId(long testBlobEntryId);

	/**
	 * Returns the blob field of this test blob entry.
	 *
	 * @return the blob field of this test blob entry
	 */
	public Blob getBlobField();

	/**
	 * Sets the blob field of this test blob entry.
	 *
	 * @param blobField the blob field of this test blob entry
	 */
	public void setBlobField(Blob blobField);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.testblob.model.TestBlobEntry testBlobEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.testblob.model.TestBlobEntry> toCacheModel();

	@Override
	public com.liferay.testblob.model.TestBlobEntry toEscapedModel();

	@Override
	public com.liferay.testblob.model.TestBlobEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}