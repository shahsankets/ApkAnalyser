/*
 * Copyright (C) 2012 Sony Mobile Communications AB
 *
 * This file is part of ApkAnalyser.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package andreflect;

import mereflect.MEClass;
import mereflect.MEField;

import org.jf.dexlib.ClassDataItem;
import org.jf.dexlib.FieldIdItem;

public class DexField extends MEField {
    public ClassDataItem.EncodedField m_field;
    public Object m_constant = null;

    public DexField(MEClass clazz, ClassDataItem.EncodedField field) {
        super(clazz);
        m_field = field;
    }

    @Override
    public String getName()
    {
        return m_field.field.getFieldName().getStringValue();
    }

    public FieldIdItem getFieldIdItem() {
        return m_field.field;
    }

    public DexClass getDexClass() {
        return (DexClass) m_class;
    }

    @Override
    public String getDescriptor()
    {
        return m_field.field.getFieldType().getTypeDescriptor();
    }

    @Override
    public Object getConstantValue()
    {
        return m_constant;
    }

}
