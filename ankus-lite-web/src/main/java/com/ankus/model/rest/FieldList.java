/**
 * This file is part of ankus.
 *
 * ankus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ankus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ankus.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.ankus.model.rest;

import java.io.Serializable;
import java.util.Date;

/**
 * Workflow Execution History Domain Object.
 *
 * @author Edward KIM
 * @since 0.1
 */
public class FieldList implements Serializable {

    /**
     * Serialization UID
     */
    private static final long serialVersionUID = 1;


    private String FieldName ;
    private String FieldType;
   
    public String getFieldName() {
        return FieldName;
    }

    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    public String getFieldType() {
        return FieldType;
    }

    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }
   
    @Override
    public String toString() {
        return "FieldList{" +
                "FieldName=" +FieldName +   
                ",FieldType=" +FieldType +  
                '}';
    }
}