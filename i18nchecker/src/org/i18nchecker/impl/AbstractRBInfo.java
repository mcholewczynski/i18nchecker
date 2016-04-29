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
 * Info about one string in resource bundle
 *
 * @author Petr Hamernik
 */
class AbstractRBInfo {

    /** Line number of this string */
    private final int line;

    /** Value of the resource message */
    private String value;

    public AbstractRBInfo(String value, int line) {
        this.value = value;
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public String getValue() {
        return value;
    }

    void appendNextLineToValue(String line) {
        value = value + "\n" + line;
    }
}
