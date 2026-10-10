package com.google.api.client.http;

import androidx.webkit.ProxyConfig;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import com.google.common.base.Splitter;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.RunnableC33958ua;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
public class UriTemplate {
    private static final String COMPOSITE_NON_EXPLODE_JOINER = ",";
    private static final Map<Character, CompositeOutput> COMPOSITE_PREFIXES = new HashMap();

    public enum CompositeOutput {
        PLUS('+', "", UriTemplate.COMPOSITE_NON_EXPLODE_JOINER, false, true),
        HASH('#', RunnableC33958ua.f72251f, UriTemplate.COMPOSITE_NON_EXPLODE_JOINER, false, true),
        DOT('.', C33978va.f72339h, C33978va.f72339h, false, false),
        FORWARD_SLASH('/', "/", "/", false, false),
        SEMI_COLON(';', ";", ";", true, false),
        QUERY('?', "?", "&", true, false),
        AMP(Character.valueOf(Typography.amp), "&", "&", true, false),
        SIMPLE(null, "", UriTemplate.COMPOSITE_NON_EXPLODE_JOINER, false, false);

        private final String explodeJoiner;
        private final String outputPrefix;
        private final Character propertyPrefix;
        private final boolean requiresVarAssignment;
        private final boolean reservedExpansion;

        /* JADX INFO: Access modifiers changed from: private */
        public String getEncodedValue(String str) {
            return this.reservedExpansion ? CharEscapers.escapeUriPathWithoutReserved(str) : CharEscapers.escapeUriConformant(str);
        }

        public String getExplodeJoiner() {
            return this.explodeJoiner;
        }

        public String getOutputPrefix() {
            return this.outputPrefix;
        }

        public int getVarNameStartIndex() {
            return this.propertyPrefix == null ? 0 : 1;
        }

        public boolean requiresVarAssignment() {
            return this.requiresVarAssignment;
        }

        CompositeOutput(Character ch2, String str, String str2, boolean z11, boolean z12) {
            this.propertyPrefix = ch2;
            this.outputPrefix = (String) Preconditions.checkNotNull(str);
            this.explodeJoiner = (String) Preconditions.checkNotNull(str2);
            this.requiresVarAssignment = z11;
            this.reservedExpansion = z12;
            if (ch2 != null) {
                UriTemplate.COMPOSITE_PREFIXES.put(ch2, this);
            }
        }
    }

    public static String expand(String str, String str2, Object obj, boolean z11) {
        if (str2.startsWith("/")) {
            GenericUrl genericUrl = new GenericUrl(str);
            genericUrl.setRawPath(null);
            str2 = genericUrl.build() + str2;
        } else if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
            str2 = str + str2;
        }
        return expand(str2, obj, z11);
    }

    static {
        CompositeOutput.values();
    }

    public static CompositeOutput getCompositeOutput(String str) {
        CompositeOutput compositeOutput = COMPOSITE_PREFIXES.get(Character.valueOf(str.charAt(0)));
        return compositeOutput == null ? CompositeOutput.SIMPLE : compositeOutput;
    }

    private static Map<String, Object> getMap(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : Data.mapOf(obj).entrySet()) {
            Object value = entry.getValue();
            if (value != null && !Data.isNull(value)) {
                linkedHashMap.put(entry.getKey(), value);
            }
        }
        return linkedHashMap;
    }

    private static String getListPropertyValue(String str, Iterator<?> it, boolean z11, CompositeOutput compositeOutput) {
        String explodeJoiner;
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            explodeJoiner = compositeOutput.getExplodeJoiner();
        } else {
            if (compositeOutput.requiresVarAssignment()) {
                sb2.append(CharEscapers.escapeUriPath(str));
                sb2.append("=");
            }
            explodeJoiner = COMPOSITE_NON_EXPLODE_JOINER;
        }
        while (it.hasNext()) {
            if (z11 && compositeOutput.requiresVarAssignment()) {
                sb2.append(CharEscapers.escapeUriPath(str));
                sb2.append("=");
            }
            sb2.append(compositeOutput.getEncodedValue(it.next().toString()));
            if (it.hasNext()) {
                sb2.append(explodeJoiner);
            }
        }
        return sb2.toString();
    }

    private static String getMapPropertyValue(String str, Map<String, Object> map, boolean z11, CompositeOutput compositeOutput) {
        String explodeJoiner;
        if (map.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = "=";
        if (z11) {
            explodeJoiner = compositeOutput.getExplodeJoiner();
        } else {
            if (compositeOutput.requiresVarAssignment()) {
                sb2.append(CharEscapers.escapeUriPath(str));
                sb2.append("=");
            }
            str2 = COMPOSITE_NON_EXPLODE_JOINER;
            explodeJoiner = COMPOSITE_NON_EXPLODE_JOINER;
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            String encodedValue = compositeOutput.getEncodedValue(next.getKey());
            String encodedValue2 = compositeOutput.getEncodedValue(next.getValue().toString());
            sb2.append(encodedValue);
            sb2.append(str2);
            sb2.append(encodedValue2);
            if (it.hasNext()) {
                sb2.append(explodeJoiner);
            }
        }
        return sb2.toString();
    }

    private static String getSimpleValue(String str, String str2, CompositeOutput compositeOutput) {
        if (!compositeOutput.requiresVarAssignment()) {
            return compositeOutput.getEncodedValue(str2);
        }
        return String.format("%s=%s", str, compositeOutput.getEncodedValue(str2));
    }

    public static String expand(String str, Object obj, boolean z11) {
        String listPropertyValue;
        Map<String, Object> map = getMap(obj);
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int iIndexOf = str.indexOf(123, i11);
            if (iIndexOf == -1) {
                if (i11 == 0 && !z11) {
                    return str;
                }
                sb2.append(str.substring(i11));
                break;
            }
            sb2.append(str.substring(i11, iIndexOf));
            int iIndexOf2 = str.indexOf(125, iIndexOf + 2);
            int i12 = iIndexOf2 + 1;
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            CompositeOutput compositeOutput = getCompositeOutput(strSubstring);
            ListIterator<String> listIterator = Splitter.m13379on(',').splitToList(strSubstring).listIterator();
            boolean z12 = true;
            while (listIterator.hasNext()) {
                String next = listIterator.next();
                boolean zEndsWith = next.endsWith(ProxyConfig.MATCH_ALL_SCHEMES);
                int varNameStartIndex = listIterator.nextIndex() == 1 ? compositeOutput.getVarNameStartIndex() : 0;
                int length2 = next.length();
                if (zEndsWith) {
                    length2--;
                }
                String strSubstring2 = next.substring(varNameStartIndex, length2);
                Object objRemove = map.remove(strSubstring2);
                if (objRemove != null) {
                    if (!z12) {
                        sb2.append(compositeOutput.getExplodeJoiner());
                    } else {
                        sb2.append(compositeOutput.getOutputPrefix());
                        z12 = false;
                    }
                    if (objRemove instanceof Iterator) {
                        listPropertyValue = getListPropertyValue(strSubstring2, (Iterator) objRemove, zEndsWith, compositeOutput);
                    } else if (!(objRemove instanceof Iterable) && !objRemove.getClass().isArray()) {
                        if (objRemove.getClass().isEnum()) {
                            String name = FieldInfo.m13333of((Enum<?>) objRemove).getName();
                            if (name == null) {
                                name = objRemove.toString();
                            }
                            listPropertyValue = getSimpleValue(strSubstring2, name, compositeOutput);
                        } else if (!Data.isValueOfPrimitiveType(objRemove)) {
                            listPropertyValue = getMapPropertyValue(strSubstring2, getMap(objRemove), zEndsWith, compositeOutput);
                        } else {
                            listPropertyValue = getSimpleValue(strSubstring2, objRemove.toString(), compositeOutput);
                        }
                    } else {
                        listPropertyValue = getListPropertyValue(strSubstring2, Types.iterableOf(objRemove).iterator(), zEndsWith, compositeOutput);
                    }
                    sb2.append((Object) listPropertyValue);
                }
            }
            i11 = i12;
        }
        if (z11) {
            GenericUrl.addQueryParams(map.entrySet(), sb2, false);
        }
        return sb2.toString();
    }
}
