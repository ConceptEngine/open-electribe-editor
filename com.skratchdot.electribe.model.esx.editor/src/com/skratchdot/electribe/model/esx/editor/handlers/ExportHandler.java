/**
 * Copyright (c) 2009-2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.electribe.model.esx.editor.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class ExportHandler extends AbstractHandler {
	public static final String EXPORT_ALL_AUDIO_FILES_ID = "com.skratchdot.electribe.model.esx.editor.commands.exportAllAudioFiles";
	public static final String EXPORT_ALL_SELECTED_FILES_ID = "com.skratchdot.electribe.model.esx.editor.commands.exportSelectedAudioFiles";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

	public void exportAllAudioFiles(ExecutionEvent event) {
	}

	public void exportSelectedAudioFiles(ExecutionEvent event) {
	}

}