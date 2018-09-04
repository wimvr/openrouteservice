package heigit.ors.api.responses.routing;

import com.vividsolutions.jts.geom.Coordinate;
import heigit.ors.api.requests.routing.APIRoutingEnums.RouteResponseGeometryType;
import heigit.ors.api.responses.routing.JSONRouteResponseObjects.EncodedPolylineGeometryResponse;
import heigit.ors.api.responses.routing.GeoJSONRouteResponseObjects.GeoJSONGeometryResponse;

public class GeometryResponseFactory {
    public static GeometryResponse createGeometryResponse(Coordinate[] coordinates, boolean includeElevation, RouteResponseGeometryType geomType) {
        GeometryResponse geomResponse = null;
        switch(geomType) {
            case GEOJSON:
                geomResponse = new GeoJSONGeometryResponse(coordinates, includeElevation);
                break;
            case ENCODED_POLYLINE:
                geomResponse = new EncodedPolylineGeometryResponse(coordinates, includeElevation);
        }

        return geomResponse;

    }
}
