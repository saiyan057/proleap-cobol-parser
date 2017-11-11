/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.data.communication;

import java.util.List;

public interface CommunicationDescriptionEntriesSymbolTableEntry {

	void addCommunicationDescriptionEntry(CommunicationDescriptionEntry communicationDescriptionEntry);

	List<CommunicationDescriptionEntry> getCommunicationDescriptionEntries();

	CommunicationDescriptionEntry getCommunicationDescriptionEntry();
}
