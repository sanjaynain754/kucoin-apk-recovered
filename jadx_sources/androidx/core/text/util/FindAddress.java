package androidx.core.text.util;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class FindAddress {
    private static final String HOUSE_COMPONENT = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final String HOUSE_END = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final String HOUSE_POST_DELIM = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String HOUSE_PRE_DELIM = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int MAX_ADDRESS_LINES = 5;
    private static final int MAX_ADDRESS_WORDS = 14;
    private static final int MAX_LOCATION_NAME_DISTANCE = 5;
    private static final int MIN_ADDRESS_WORDS = 4;

    /* JADX INFO: renamed from: NL */
    private static final String f2297NL = "\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: SP */
    private static final String f2298SP = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";
    private static final String WORD_DELIM = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final String WORD_END = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: WS */
    private static final String f2299WS = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int kMaxAddressNameWordLength = 25;
    private static final ZipRange[] sStateZipCodeRanges = {new ZipRange(99, 99, -1, -1), new ZipRange(35, 36, -1, -1), new ZipRange(71, 72, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(85, 86, -1, -1), new ZipRange(90, 96, -1, -1), new ZipRange(80, 81, -1, -1), new ZipRange(6, 6, -1, -1), new ZipRange(20, 20, -1, -1), new ZipRange(19, 19, -1, -1), new ZipRange(32, 34, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(30, 31, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(50, 52, -1, -1), new ZipRange(83, 83, -1, -1), new ZipRange(60, 62, -1, -1), new ZipRange(46, 47, -1, -1), new ZipRange(66, 67, 73, -1), new ZipRange(40, 42, -1, -1), new ZipRange(70, 71, -1, -1), new ZipRange(1, 2, -1, -1), new ZipRange(20, 21, -1, -1), new ZipRange(3, 4, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(48, 49, -1, -1), new ZipRange(55, 56, -1, -1), new ZipRange(63, 65, -1, -1), new ZipRange(96, 96, -1, -1), new ZipRange(38, 39, -1, -1), new ZipRange(55, 56, -1, -1), new ZipRange(27, 28, -1, -1), new ZipRange(58, 58, -1, -1), new ZipRange(68, 69, -1, -1), new ZipRange(3, 4, -1, -1), new ZipRange(7, 8, -1, -1), new ZipRange(87, 88, 86, -1), new ZipRange(88, 89, 96, -1), new ZipRange(10, 14, 0, 6), new ZipRange(43, 45, -1, -1), new ZipRange(73, 74, -1, -1), new ZipRange(97, 97, -1, -1), new ZipRange(15, 19, -1, -1), new ZipRange(6, 6, 0, 9), new ZipRange(96, 96, -1, -1), new ZipRange(2, 2, -1, -1), new ZipRange(29, 29, -1, -1), new ZipRange(57, 57, -1, -1), new ZipRange(37, 38, -1, -1), new ZipRange(75, 79, 87, 88), new ZipRange(84, 84, -1, -1), new ZipRange(22, 24, 20, -1), new ZipRange(6, 9, -1, -1), new ZipRange(5, 5, -1, -1), new ZipRange(98, 99, -1, -1), new ZipRange(53, 54, -1, -1), new ZipRange(24, 26, -1, -1), new ZipRange(82, 83, -1, -1)};
    private static final Pattern sWordRe = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern sHouseNumberRe = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern sStateRe = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern sLocationNameRe = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final Pattern sSuffixedNumberRe = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
    private static final Pattern sZipCodeRe = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    private static boolean checkHouseNumber(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (Character.isDigit(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 > 5) {
            return false;
        }
        Matcher matcher = sSuffixedNumberRe.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i13 = Integer.parseInt(matcher.group(1));
        if (i13 == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i14 = i13 % 10;
        if (i14 == 1) {
            return lowerCase.equals(i13 % 100 != 11 ? CmcdConfiguration.KEY_STREAM_TYPE : "th");
        }
        if (i14 == 2) {
            return lowerCase.equals(i13 % 100 != 12 ? "nd" : "th");
        }
        if (i14 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(i13 % 100 != 13 ? "rd" : "th");
    }

    private static boolean isValidZipCode(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (iGroupCount > 0) {
            int i11 = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i11;
                break;
            }
            iGroupCount = i11;
        }
        return sZipCodeRe.matcher(str).matches() && sStateZipCodeRanges[iGroupCount].matches(str);
    }

    @VisibleForTesting
    public static MatchResult matchHouseNumber(String str, int i11) {
        if (i11 > 0 && HOUSE_PRE_DELIM.indexOf(str.charAt(i11 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = sHouseNumberRe.matcher(str).region(i11, str.length());
        if (matcherRegion.lookingAt()) {
            MatchResult matchResult = matcherRegion.toMatchResult();
            if (checkHouseNumber(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    @VisibleForTesting
    public static MatchResult matchState(String str, int i11) {
        if (i11 > 0 && WORD_DELIM.indexOf(str.charAt(i11 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = sStateRe.matcher(str).region(i11, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }

    public static class ZipRange {
        int mException1;
        int mException2;
        int mHigh;
        int mLow;

        public boolean matches(String str) {
            int i11 = Integer.parseInt(str.substring(0, 2));
            return (this.mLow <= i11 && i11 <= this.mHigh) || i11 == this.mException1 || i11 == this.mException2;
        }

        public ZipRange(int i11, int i12, int i13, int i14) {
            this.mLow = i11;
            this.mHigh = i12;
            this.mException1 = i13;
            this.mException2 = i14;
        }
    }

    public static String findAddress(String str) {
        Matcher matcher = sHouseNumberRe.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (checkHouseNumber(matcher.group(0))) {
                int iStart = matcher.start();
                int iAttemptMatch = attemptMatch(str, matcher);
                if (iAttemptMatch > 0) {
                    return str.substring(iStart, iAttemptMatch);
                }
                iEnd = -iAttemptMatch;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }

    @VisibleForTesting
    public static boolean isValidLocationName(String str) {
        return sLocationNameRe.matcher(str).matches();
    }

    private FindAddress() {
    }

    private static int attemptMatch(String str, MatchResult matchResult) {
        int length;
        MatchResult matchResultMatchState;
        int iEnd = matchResult.end();
        Matcher matcher = sWordRe.matcher(str);
        String strGroup = "";
        int i11 = -1;
        int iEnd2 = -1;
        int i12 = 1;
        int i13 = 1;
        boolean z11 = true;
        boolean z12 = false;
        while (iEnd < str.length()) {
            if (!matcher.find(iEnd)) {
                length = str.length();
            } else if (matcher.end() - matcher.start() > 25) {
                length = matcher.end();
            } else {
                while (iEnd < matcher.start()) {
                    int i14 = iEnd + 1;
                    if (f2297NL.indexOf(str.charAt(iEnd)) != -1) {
                        i12++;
                    }
                    iEnd = i14;
                }
                if (i12 > 5 || (i13 = i13 + 1) > 14) {
                    break;
                }
                if (matchHouseNumber(str, iEnd) != null) {
                    if (z11 && i12 > 1) {
                        return -iEnd;
                    }
                    if (i11 == -1) {
                        i11 = iEnd;
                    }
                } else {
                    if (isValidLocationName(matcher.group(0))) {
                        z12 = true;
                    } else {
                        if (i13 == 5 && !z12) {
                            iEnd = matcher.end();
                            break;
                        }
                        if (z12 && i13 > 4 && (matchResultMatchState = matchState(str, iEnd)) != null) {
                            if (strGroup.equals("et") && matchResultMatchState.group(0).equals("al")) {
                                iEnd = matchResultMatchState.end();
                                break;
                            }
                            Matcher matcher2 = sWordRe.matcher(str);
                            if (matcher2.find(matchResultMatchState.end())) {
                                if (isValidZipCode(matcher2.group(0), matchResultMatchState)) {
                                    return matcher2.end();
                                }
                            } else {
                                iEnd2 = matchResultMatchState.end();
                            }
                        }
                    }
                    z11 = false;
                }
                strGroup = matcher.group(0);
                iEnd = matcher.end();
            }
            return -length;
        }
        if (iEnd2 > 0) {
            return iEnd2;
        }
        if (i11 <= 0) {
            i11 = iEnd;
        }
        return -i11;
    }

    @VisibleForTesting
    public static boolean isValidZipCode(String str, String str2) {
        return isValidZipCode(str, matchState(str2, 0));
    }

    @VisibleForTesting
    public static boolean isValidZipCode(String str) {
        return sZipCodeRe.matcher(str).matches();
    }
}
