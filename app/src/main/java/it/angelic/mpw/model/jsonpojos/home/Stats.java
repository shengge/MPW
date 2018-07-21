package it.angelic.mpw.model.jsonpojos.home;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Stats implements Serializable {

    private final static long serialVersionUID = -8772158729012648157L;
    private Date lastBlockFound;
    private Long roundShares;
    @SerializedName("roundShares-diff")
    private Long roundSharesDiff;

    /**
     * No args constructor for use in serialization
     */
    public Stats() {
    }

    public Long getRoundSharesDiff() {
        return roundSharesDiff;
    }

    public void setRoundSharesDiff(Long roundSharesDiff) {
        this.roundSharesDiff = roundSharesDiff;
    }

    public Date getLastBlockFound() {
        return lastBlockFound;
    }

    public void setLastBlockFound(Date lastBlockFound) {
        this.lastBlockFound = lastBlockFound;
    }

    /**
     * Arguable getter to patch anorak pool
     * @return roundShares or backup on roundSharesDiff
     */
    public Long getRoundShares() {
        if (roundShares != null)
            return roundShares;
        if (roundSharesDiff != null)
            return roundSharesDiff;
        return 0L;
    }

    public void setRoundShares(Long roundShares) {
        this.roundShares = roundShares;
    }


}