package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class map_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("         <title>Place Autocomplete</title>\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <style>\n");
      out.write("      /* Always set the map height explicitly to define the size of the div\n");
      out.write("       * element that contains the map. */\n");
      out.write("      #map {\n");
      out.write("        height: 100%;\n");
      out.write("      }\n");
      out.write("      /* Optional: Makes the sample page fill the window. */\n");
      out.write("      html, body {\n");
      out.write("        height: 100%;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("      .controls {\n");
      out.write("        margin-top: 10px;\n");
      out.write("        border: 1px solid transparent;\n");
      out.write("        border-radius: 2px 0 0 2px;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        -moz-box-sizing: border-box;\n");
      out.write("        height: 32px;\n");
      out.write("        outline: none;\n");
      out.write("        box-shadow: 0 2px 6px rgba(0, 0, 0, 0.3);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #origin-input,\n");
      out.write("      #destination-input {\n");
      out.write("        background-color: #fff;\n");
      out.write("        font-family: Roboto;\n");
      out.write("        font-size: 15px;\n");
      out.write("        font-weight: 300;\n");
      out.write("        margin-left: 12px;\n");
      out.write("        padding: 0 11px 0 13px;\n");
      out.write("        text-overflow: ellipsis;\n");
      out.write("        width: 200px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #origin-input:focus,\n");
      out.write("      #destination-input:focus {\n");
      out.write("        border-color: #4d90fe;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #mode-selector {\n");
      out.write("        color: #fff;\n");
      out.write("        background-color: #4d90fe;\n");
      out.write("        margin-left: 12px;\n");
      out.write("        padding: 5px 11px 0px 11px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #mode-selector label {\n");
      out.write("        font-family: Roboto;\n");
      out.write("        font-size: 13px;\n");
      out.write("        font-weight: 300;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <input id=\"origin-input\" class=\"controls\" type=\"text\"\n");
      out.write("        placeholder=\"Enter an origin location\">\n");
      out.write("\n");
      out.write("    <input id=\"destination-input\" class=\"controls\" type=\"text\"\n");
      out.write("        placeholder=\"Enter a destination location\">\n");
      out.write("\n");
      out.write("    <div id=\"mode-selector\" class=\"controls\">\n");
      out.write("      <input type=\"radio\" name=\"type\" id=\"changemode-walking\" checked=\"checked\">\n");
      out.write("      <label for=\"changemode-walking\">Walking</label>\n");
      out.write("\n");
      out.write("      <input type=\"radio\" name=\"type\" id=\"changemode-transit\">\n");
      out.write("      <label for=\"changemode-transit\">Transit</label>\n");
      out.write("\n");
      out.write("      <input type=\"radio\" name=\"type\" id=\"changemode-driving\">\n");
      out.write("      <label for=\"changemode-driving\">Driving</label>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("      // This example requires the Places library. Include the libraries=places\n");
      out.write("      // parameter when you first load the API. For example:\n");
      out.write("      // <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places\">\n");
      out.write("\n");
      out.write("      function initMap() {\n");
      out.write("        var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          mapTypeControl: false,\n");
      out.write("          center: {lat: -33.8688, lng: 151.2195},\n");
      out.write("          zoom: 13\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        new AutocompleteDirectionsHandler(map);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("       /**\n");
      out.write("        * @constructor\n");
      out.write("       */\n");
      out.write("      function AutocompleteDirectionsHandler(map) {\n");
      out.write("        this.map = map;\n");
      out.write("        this.originPlaceId = null;\n");
      out.write("        this.destinationPlaceId = null;\n");
      out.write("        this.travelMode = 'WALKING';\n");
      out.write("        var originInput = document.getElementById('origin-input');\n");
      out.write("        var destinationInput = document.getElementById('destination-input');\n");
      out.write("        var modeSelector = document.getElementById('mode-selector');\n");
      out.write("        this.directionsService = new google.maps.DirectionsService;\n");
      out.write("        this.directionsDisplay = new google.maps.DirectionsRenderer;\n");
      out.write("        this.directionsDisplay.setMap(map);\n");
      out.write("\n");
      out.write("        var originAutocomplete = new google.maps.places.Autocomplete(\n");
      out.write("            originInput, {placeIdOnly: true});\n");
      out.write("        var destinationAutocomplete = new google.maps.places.Autocomplete(\n");
      out.write("            destinationInput, {placeIdOnly: true});\n");
      out.write("\n");
      out.write("        this.setupClickListener('changemode-walking', 'WALKING');\n");
      out.write("        this.setupClickListener('changemode-transit', 'TRANSIT');\n");
      out.write("        this.setupClickListener('changemode-driving', 'DRIVING');\n");
      out.write("\n");
      out.write("        this.setupPlaceChangedListener(originAutocomplete, 'ORIG');\n");
      out.write("        this.setupPlaceChangedListener(destinationAutocomplete, 'DEST');\n");
      out.write("\n");
      out.write("        this.map.controls[google.maps.ControlPosition.TOP_LEFT].push(originInput);\n");
      out.write("        this.map.controls[google.maps.ControlPosition.TOP_LEFT].push(destinationInput);\n");
      out.write("        this.map.controls[google.maps.ControlPosition.TOP_LEFT].push(modeSelector);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // Sets a listener on a radio button to change the filter type on Places\n");
      out.write("      // Autocomplete.\n");
      out.write("      AutocompleteDirectionsHandler.prototype.setupClickListener = function(id, mode) {\n");
      out.write("        var radioButton = document.getElementById(id);\n");
      out.write("        var me = this;\n");
      out.write("        radioButton.addEventListener('click', function() {\n");
      out.write("          me.travelMode = mode;\n");
      out.write("          me.route();\n");
      out.write("        });\n");
      out.write("      };\n");
      out.write("\n");
      out.write("      AutocompleteDirectionsHandler.prototype.setupPlaceChangedListener = function(autocomplete, mode) {\n");
      out.write("        var me = this;\n");
      out.write("        autocomplete.bindTo('bounds', this.map);\n");
      out.write("        autocomplete.addListener('place_changed', function() {\n");
      out.write("          var place = autocomplete.getPlace();\n");
      out.write("          if (!place.place_id) {\n");
      out.write("            window.alert(\"Please select an option from the dropdown list.\");\n");
      out.write("            return;\n");
      out.write("          }\n");
      out.write("          if (mode === 'ORIG') {\n");
      out.write("            me.originPlaceId = place.place_id;\n");
      out.write("          } else {\n");
      out.write("            me.destinationPlaceId = place.place_id;\n");
      out.write("          }\n");
      out.write("          me.route();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("      };\n");
      out.write("\n");
      out.write("      AutocompleteDirectionsHandler.prototype.route = function() {\n");
      out.write("        if (!this.originPlaceId || !this.destinationPlaceId) {\n");
      out.write("          return;\n");
      out.write("        }\n");
      out.write("        var me = this;\n");
      out.write("\n");
      out.write("        this.directionsService.route({\n");
      out.write("          origin: {'placeId': this.originPlaceId},\n");
      out.write("          destination: {'placeId': this.destinationPlaceId},\n");
      out.write("          travelMode: this.travelMode\n");
      out.write("        }, function(response, status) {\n");
      out.write("          if (status === 'OK') {\n");
      out.write("            me.directionsDisplay.setDirections(response);\n");
      out.write("          } else {\n");
      out.write("            window.alert('Directions request failed due to ' + status);\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      };\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCgirJG7bAaDL8Wl6kU9qltwkyzmQGhap8&libraries=places&callback=initMap\"\n");
      out.write("        async defer></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
