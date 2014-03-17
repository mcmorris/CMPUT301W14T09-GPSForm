/**

License GPLv3: GNU GPL Version 3
<http://gnu.org/licenses/gpl.html>.
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package ca.cmput301w14t09.Model;

import java.io.Serializable;

/**
 * 
 * GeoLocation is an object that holds the
 * latitude and longitude of a comment
 *
 */

public class GeoLocation implements Serializable {

	private static final long serialVersionUID = 60L;
	private double latitude;
	private double longitude;
	private String name;

	/**
	 * initiate the Geolocation object with set lat lng as 0 and name as ""
	 *
	 */

	public GeoLocation() {
		latitude = 0.0;
		longitude = 0.0;
		name = "";
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This function will be used in further iterations to calculate proximity to a
	 * target location
	 * 
	 */

	public double calculateProximity(GeoLocation targetLocation){
		return 0;
	}

}