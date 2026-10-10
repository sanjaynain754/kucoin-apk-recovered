package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HostAndPort implements Serializable {
    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private static String[] getHostAndPortFromBracketedHost(String str) {
        Preconditions.checkArgument(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        Preconditions.checkArgument(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i11 = iLastIndexOf + 1;
        if (i11 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        Preconditions.checkArgument(str.charAt(i11) == ':', "Only a colon may follow a close bracket: %s", str);
        int i12 = iLastIndexOf + 2;
        for (int i13 = i12; i13 < str.length(); i13++) {
            Preconditions.checkArgument(Character.isDigit(str.charAt(i13)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i12)};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostAndPort) {
            HostAndPort hostAndPort = (HostAndPort) obj;
            if (Objects.equal(this.host, hostAndPort.host) && this.port == hostAndPort.port) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidPort(int i11) {
        return i11 >= 0 && i11 <= 65535;
    }

    public String getHost() {
        return this.host;
    }

    public boolean hasPort() {
        return this.port >= 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.host, Integer.valueOf(this.port));
    }

    @CanIgnoreReturnValue
    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", this.host);
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.host);
            sb2.append(']');
        } else {
            sb2.append(this.host);
        }
        if (hasPort()) {
            sb2.append(':');
            sb2.append(this.port);
        }
        return sb2.toString();
    }

    private HostAndPort(String str, int i11, boolean z11) {
        this.host = str;
        this.port = i11;
        this.hasBracketlessColons = z11;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return hostAndPortFromString;
    }

    public static HostAndPort fromParts(String str, int i11) {
        Preconditions.checkArgument(isValidPort(i11), "Port out of range: %s", i11);
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(hostAndPortFromString.host, i11, hostAndPortFromString.hasBracketlessColons);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    @CanIgnoreReturnValue
    public static HostAndPort fromString(String str) {
        boolean z11;
        boolean z12;
        String strSubstring;
        String str2;
        String strSubstring2;
        Preconditions.checkNotNull(str);
        int i11 = -1;
        boolean z13 = true;
        if (str.startsWith("[")) {
            String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(str);
            strSubstring2 = hostAndPortFromBracketedHost[0];
            strSubstring = hostAndPortFromBracketedHost[1];
        } else {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf >= 0) {
                int i12 = iIndexOf + 1;
                if (str.indexOf(58, i12) == -1) {
                    strSubstring2 = str.substring(0, iIndexOf);
                    strSubstring = str.substring(i12);
                }
                if (!Strings.isNullOrEmpty(strSubstring)) {
                    if (!strSubstring.startsWith("+") || !CharMatcher.ascii().matchesAllOf(strSubstring)) {
                        z13 = false;
                    }
                    Preconditions.checkArgument(z13, "Unparseable port number: %s", str);
                    try {
                        i11 = Integer.parseInt(strSubstring);
                        Preconditions.checkArgument(isValidPort(i11), "Port number out of range: %s", str);
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Unparseable port number: " + str);
                    }
                }
                return new HostAndPort(str2, i11, z12);
            }
            if (iIndexOf >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11;
            strSubstring = null;
            str2 = str;
            if (!Strings.isNullOrEmpty(strSubstring)) {
                if (!strSubstring.startsWith("+")) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                Preconditions.checkArgument(z13, "Unparseable port number: %s", str);
                i11 = Integer.parseInt(strSubstring);
                Preconditions.checkArgument(isValidPort(i11), "Port number out of range: %s", str);
            }
            return new HostAndPort(str2, i11, z12);
        }
        str2 = strSubstring2;
        z12 = false;
        if (!Strings.isNullOrEmpty(strSubstring)) {
            if (!strSubstring.startsWith("+")) {
                z13 = false;
            } else {
                z13 = false;
            }
            Preconditions.checkArgument(z13, "Unparseable port number: %s", str);
            i11 = Integer.parseInt(strSubstring);
            Preconditions.checkArgument(isValidPort(i11), "Port number out of range: %s", str);
        }
        return new HostAndPort(str2, i11, z12);
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.port;
    }

    public int getPortOrDefault(int i11) {
        if (hasPort()) {
            return this.port;
        }
        return i11;
    }

    public HostAndPort withDefaultPort(int i11) {
        Preconditions.checkArgument(isValidPort(i11));
        if (hasPort()) {
            return this;
        }
        return new HostAndPort(this.host, i11, this.hasBracketlessColons);
    }
}
