/**
 * Copyright 2010-2011 Petr Hamernik
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
 */
package org.i18nchecker.impl;

/**
 * Description of columns in CSV file for translation. This CSV file is exported from primary resource bundles.
 * When translated it's used for generation of translated resource bundle files (e.g. Bundle_ja.properties).
 *
 * @author Petr Hamernik, Michał Cholewczyński
 */
enum TranslatedCSVColumns {

    KEY(0, "Variable name"),
    PRIMARY(1, "English"),
    SECONDARY(2, "Polski"),
    TRANSLATED(3, "Translation"),
    MODULE(4, "Module name"),
    PACKAGE(5, "Package");
    private final int index;
    private final String headerName;

    TranslatedCSVColumns(int index, String headerName) {
        this.index = index;
        this.headerName = headerName;
    }

    public int getIndex() {
        return index;
    }

    String getHeaderName() {
        return headerName;
    }
}
