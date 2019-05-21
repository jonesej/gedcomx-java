/**
 * Copyright Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.familysearch.platform.reservations;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.gedcomx.conclusion.Conclusion;
import org.gedcomx.rt.json.JsonElementWrapper;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An ordinance reservation.
 *
 */
@XmlRootElement
@JsonElementWrapper (name = "reservations")
@XmlType ( name = "Reservation" )
@JsonInclude ( JsonInclude.Include.NON_NULL )
// todo GenericRelationshipTerms ordinances  This class should be deleted
@Deprecated
public class Reservation extends Conclusion {

  // Just empty for now

}
