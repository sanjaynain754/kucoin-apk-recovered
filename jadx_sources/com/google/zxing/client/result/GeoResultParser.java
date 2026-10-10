package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes56.dex */
public final class GeoResultParser extends ResultParser {
    private static final Pattern GEO_URL_PATTERN = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    @Override // com.google.zxing.client.result.ResultParser
    public GeoParsedResult parse(Result result) {
        Matcher matcher = GEO_URL_PATTERN.matcher(ResultParser.getMassagedText(result));
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(4);
        try {
            double d11 = Double.parseDouble(matcher.group(1));
            if (d11 <= 90.0d && d11 >= -90.0d) {
                double d12 = Double.parseDouble(matcher.group(2));
                if (d12 <= 180.0d && d12 >= -180.0d) {
                    double d13 = 0.0d;
                    if (matcher.group(3) != null) {
                        double d14 = Double.parseDouble(matcher.group(3));
                        if (d14 < 0.0d) {
                            return null;
                        }
                        d13 = d14;
                    }
                    return new GeoParsedResult(d11, d12, d13, strGroup);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
