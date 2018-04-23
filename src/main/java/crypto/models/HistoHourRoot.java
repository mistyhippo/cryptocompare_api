package crypto.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;

public class HistoHourRoot {

    @JsonProperty("Response")
    String Response;
    @JsonProperty("Data")
    Data[] Data;
    @JsonProperty("TimeTo")
    long TimeTo;
    @JsonProperty("TimeFrom")
    long TimeFrom;

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }

    public Data[] getData() {
        return Data;
    }

    public void setData(Data[] data) {
        this.Data = data;
    }

    public long getTimeTo() {
        return TimeTo;
    }

    public void setTimeTo(long timeTo) {
        TimeTo = timeTo;
    }

    public long getTimeFrom() {
        return TimeFrom;
    }

    public void setTimeFrom(long timeFrom) {
        TimeFrom = timeFrom;
    }
}
