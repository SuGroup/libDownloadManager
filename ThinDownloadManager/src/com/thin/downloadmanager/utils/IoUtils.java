/*******************************************************************************
 * Copyright 2011-2014 Sergey Tarasevich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.thin.downloadmanager.utils;

import java.io.Closeable;

/**
 * Provides I/O operations
 *
 * @author Sergey Tarasevich (nostra13[at]gmail[dot]com)
 * @since 1.0.0
 */
public final class IoUtils {

	/** {@value} */
	public static final int DEFAULT_BUFFER_SIZE = 32 * 1024; // 32 KB
	/** {@value} */
	public static final int DEFAULT_IMAGE_TOTAL_SIZE = 500 * 1024; // 500 Kb
	/** {@value} */
	public static final int CONTINUE_LOADING_PERCENTAGE = 75;

	private IoUtils() {
	}

	public static void closeSilently(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (Exception ignored) {
			}
		}
	}
}
