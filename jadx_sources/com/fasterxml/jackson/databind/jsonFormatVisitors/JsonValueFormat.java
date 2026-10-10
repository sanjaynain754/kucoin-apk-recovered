package com.fasterxml.jackson.databind.jsonFormatVisitors;

import androidx.autofill.HintConstants;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.annotation.InterfaceC6294y;

/* JADX INFO: loaded from: classes45.dex */
public enum JsonValueFormat {
    COLOR("color"),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE(HintConstants.AUTOFILL_HINT_PHONE),
    REGEX("regex"),
    STYLE(TtmlNode.TAG_STYLE),
    TIME("time"),
    URI("uri"),
    UTC_MILLISEC("utc-millisec"),
    UUID("uuid");

    private final String _desc;

    @Override // java.lang.Enum
    @InterfaceC6294y
    public String toString() {
        return this._desc;
    }

    JsonValueFormat(String str) {
        this._desc = str;
    }
}
