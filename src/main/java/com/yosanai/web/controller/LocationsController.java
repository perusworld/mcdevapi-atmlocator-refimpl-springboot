package com.yosanai.web.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.locations.ATMLocations;
import com.yosanai.web.model.LocationsRequest;

@RestController
public class LocationsController {

	@RequestMapping(value = "/atmsNearby", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ATMLocations atmsNearby(@RequestBody LocationsRequest req) throws Exception {
		RequestMap map = new RequestMap();
		map.set("PageLength", "5");
		map.set("PageOffset", "0");
		map.set("Latitude", req.getLatitude());
		map.set("Longitude", req.getLongitude());
		return ATMLocations.query(map);
	}
}
