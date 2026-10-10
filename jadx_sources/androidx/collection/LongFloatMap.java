package androidx.collection;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LongFloatMap.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0006\u0010\u001b\u001a\u00020\u0016J&\u0010\u001b\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0011\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0019H\u0086\u0002J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0019J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u0004J&\u0010!\u001a\u00020\u00042\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0013\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0019H\u0001JD\u0010%\u001a\u00020&26\u0010'\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b( \u0012\u0004\u0012\u00020&0\u0018H\u0086\bø\u0001\u0000J/\u0010*\u001a\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020&0+H\u0081\bø\u0001\u0000J/\u0010-\u001a\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020&0+H\u0086\bø\u0001\u0000J/\u0010.\u001a\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b( \u0012\u0004\u0012\u00020&0+H\u0086\bø\u0001\u0000J\u0011\u0010/\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0019H\u0086\u0002J\u0016\u00100\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u001aJ\"\u00102\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00192\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a03H\u0086\bø\u0001\u0000J\b\u00104\u001a\u00020\u0004H\u0016J\u0006\u00105\u001a\u00020\u0016J\u0006\u00106\u001a\u00020\u0016J:\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020:H\u0007Jx\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020:28\b\u0004\u0010?\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b( \u0012\u0004\u0012\u00020:0\u0018H\u0087\bø\u0001\u0000J\u0006\u0010@\u001a\u00020\u0016J\b\u0010A\u001a\u000208H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0002R\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\nR\u0018\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u0082\u0001\u0001B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, m90084d2 = {"Landroidx/collection/LongFloatMap;", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", TtmlNode.COMBINE_ALL, "", "predicate", "Lkotlin/Function2;", "", "", "any", "contains", "key", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", TUIConstants.TUIContact.LIMIT, "truncated", ViewProps.TRANSFORM, "none", "toString", "Landroidx/collection/MutableLongFloatMap;", "collection"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLongFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongFloatMap.kt\nandroidx/collection/LongFloatMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1047:1\n357#1,6:1050\n367#1,3:1057\n370#1,9:1061\n357#1,6:1070\n367#1,3:1077\n370#1,9:1081\n357#1,6:1090\n367#1,3:1097\n370#1,9:1101\n385#1,4:1110\n357#1,6:1114\n367#1,3:1121\n370#1,2:1125\n389#1,2:1127\n373#1,6:1129\n391#1:1135\n385#1,4:1136\n357#1,6:1140\n367#1,3:1147\n370#1,2:1151\n389#1,2:1153\n373#1,6:1155\n391#1:1161\n385#1,4:1162\n357#1,6:1166\n367#1,3:1173\n370#1,2:1177\n389#1,2:1179\n373#1,6:1181\n391#1:1187\n410#1,3:1188\n357#1,6:1191\n367#1,3:1198\n370#1,2:1202\n413#1,2:1204\n373#1,6:1206\n415#1:1212\n385#1,4:1213\n357#1,6:1217\n367#1,3:1224\n370#1,2:1228\n389#1,2:1230\n373#1,6:1232\n391#1:1238\n385#1,4:1239\n357#1,6:1243\n367#1,3:1250\n370#1,2:1254\n389#1,2:1256\n373#1,6:1258\n391#1:1264\n385#1,4:1265\n357#1,6:1269\n367#1,3:1276\n370#1,2:1280\n389#1,2:1282\n373#1,6:1284\n391#1:1290\n385#1,4:1291\n357#1,6:1295\n367#1,3:1302\n370#1,2:1306\n389#1,2:1308\n373#1,6:1310\n391#1:1316\n385#1,4:1317\n357#1,6:1321\n367#1,3:1328\n370#1,2:1332\n389#1,2:1334\n373#1,6:1336\n391#1:1342\n385#1,4:1343\n357#1,6:1347\n367#1,3:1354\n370#1,2:1358\n389#1,2:1360\n373#1,6:1362\n391#1:1368\n519#1,11:1385\n385#1,4:1396\n357#1,6:1400\n367#1,3:1407\n370#1,2:1411\n389#1:1413\n530#1,10:1414\n390#1:1424\n373#1,6:1425\n391#1:1431\n540#1,2:1432\n519#1,11:1434\n385#1,4:1445\n357#1,6:1449\n367#1,3:1456\n370#1,2:1460\n389#1:1462\n530#1,10:1463\n390#1:1473\n373#1,6:1474\n391#1:1480\n540#1,2:1481\n519#1,11:1483\n385#1,4:1494\n357#1,6:1498\n367#1,3:1505\n370#1,2:1509\n389#1:1511\n530#1,10:1512\n390#1:1522\n373#1,6:1523\n391#1:1529\n540#1,2:1530\n519#1,11:1532\n385#1,4:1543\n357#1,6:1547\n367#1,3:1554\n370#1,2:1558\n389#1:1560\n530#1,10:1561\n390#1:1571\n373#1,6:1572\n391#1:1578\n540#1,2:1579\n519#1,11:1581\n385#1,4:1592\n357#1,6:1596\n367#1,3:1603\n370#1,2:1607\n389#1:1609\n530#1,10:1610\n390#1:1620\n373#1,6:1621\n391#1:1627\n540#1,2:1628\n1826#2:1048\n1688#2:1049\n1826#2:1056\n1688#2:1060\n1826#2:1076\n1688#2:1080\n1826#2:1096\n1688#2:1100\n1826#2:1120\n1688#2:1124\n1826#2:1146\n1688#2:1150\n1826#2:1172\n1688#2:1176\n1826#2:1197\n1688#2:1201\n1826#2:1223\n1688#2:1227\n1826#2:1249\n1688#2:1253\n1826#2:1275\n1688#2:1279\n1826#2:1301\n1688#2:1305\n1826#2:1327\n1688#2:1331\n1826#2:1353\n1688#2:1357\n1619#2:1372\n1615#2:1373\n1795#2,3:1374\n1809#2,3:1377\n1733#2:1380\n1721#2:1381\n1715#2:1382\n1728#2:1383\n1818#2:1384\n1826#2:1406\n1688#2:1410\n1826#2:1455\n1688#2:1459\n1826#2:1504\n1688#2:1508\n1826#2:1553\n1688#2:1557\n1826#2:1602\n1688#2:1606\n849#3,3:1369\n*S KotlinDebug\n*F\n+ 1 LongFloatMap.kt\nandroidx/collection/LongFloatMap\n*L\n388#1:1050,6\n388#1:1057,3\n388#1:1061,9\n400#1:1070,6\n400#1:1077,3\n400#1:1081,9\n412#1:1090,6\n412#1:1097,3\n412#1:1101,9\n421#1:1110,4\n421#1:1114,6\n421#1:1121,3\n421#1:1125,2\n421#1:1127,2\n421#1:1129,6\n421#1:1135\n431#1:1136,4\n431#1:1140,6\n431#1:1147,3\n431#1:1151,2\n431#1:1153,2\n431#1:1155,6\n431#1:1161\n447#1:1162,4\n447#1:1166,6\n447#1:1173,3\n447#1:1177,2\n447#1:1179,2\n447#1:1181,6\n447#1:1187\n470#1:1188,3\n470#1:1191,6\n470#1:1198,3\n470#1:1202,2\n470#1:1204,2\n470#1:1206,6\n470#1:1212\n494#1:1213,4\n494#1:1217,6\n494#1:1224,3\n494#1:1228,2\n494#1:1230,2\n494#1:1232,6\n494#1:1238\n529#1:1239,4\n529#1:1243,6\n529#1:1250,3\n529#1:1254,2\n529#1:1256,2\n529#1:1258,6\n529#1:1264\n529#1:1265,4\n529#1:1269,6\n529#1:1276,3\n529#1:1280,2\n529#1:1282,2\n529#1:1284,6\n529#1:1290\n550#1:1291,4\n550#1:1295,6\n550#1:1302,3\n550#1:1306,2\n550#1:1308,2\n550#1:1310,6\n550#1:1316\n576#1:1317,4\n576#1:1321,6\n576#1:1328,3\n576#1:1332,2\n576#1:1334,2\n576#1:1336,6\n576#1:1342\n598#1:1343,4\n598#1:1347,6\n598#1:1354,3\n598#1:1358,2\n598#1:1360,2\n598#1:1362,6\n598#1:1368\n-1#1:1385,11\n-1#1:1396,4\n-1#1:1400,6\n-1#1:1407,3\n-1#1:1411,2\n-1#1:1413\n-1#1:1414,10\n-1#1:1424\n-1#1:1425,6\n-1#1:1431\n-1#1:1432,2\n-1#1:1434,11\n-1#1:1445,4\n-1#1:1449,6\n-1#1:1456,3\n-1#1:1460,2\n-1#1:1462\n-1#1:1463,10\n-1#1:1473\n-1#1:1474,6\n-1#1:1480\n-1#1:1481,2\n-1#1:1483,11\n-1#1:1494,4\n-1#1:1498,6\n-1#1:1505,3\n-1#1:1509,2\n-1#1:1511\n-1#1:1512,10\n-1#1:1522\n-1#1:1523,6\n-1#1:1529\n-1#1:1530,2\n-1#1:1532,11\n-1#1:1543,4\n-1#1:1547,6\n-1#1:1554,3\n-1#1:1558,2\n-1#1:1560\n-1#1:1561,10\n-1#1:1571\n-1#1:1572,6\n-1#1:1578\n-1#1:1579,2\n-1#1:1581,11\n-1#1:1592,4\n-1#1:1596,6\n-1#1:1603,3\n-1#1:1607,2\n-1#1:1609\n-1#1:1610,10\n-1#1:1620\n-1#1:1621,6\n-1#1:1627\n-1#1:1628,2\n362#1:1048\n369#1:1049\n388#1:1056\n388#1:1060\n400#1:1076\n400#1:1080\n412#1:1096\n412#1:1100\n421#1:1120\n421#1:1124\n431#1:1146\n431#1:1150\n447#1:1172\n447#1:1176\n470#1:1197\n470#1:1201\n494#1:1223\n494#1:1227\n529#1:1249\n529#1:1253\n529#1:1275\n529#1:1279\n550#1:1301\n550#1:1305\n576#1:1327\n576#1:1331\n598#1:1353\n598#1:1357\n618#1:1372\n621#1:1373\n625#1:1374,3\n626#1:1377,3\n627#1:1380\n628#1:1381\n628#1:1382\n632#1:1383\n635#1:1384\n-1#1:1406\n-1#1:1410\n-1#1:1455\n-1#1:1459\n-1#1:1504\n-1#1:1508\n-1#1:1553\n-1#1:1557\n-1#1:1602\n-1#1:1606\n617#1:1369,3\n*E\n"})
public abstract class LongFloatMap {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public long[] keys;

    @JvmField
    @NotNull
    public long[] metadata;

    @JvmField
    @NotNull
    public float[] values;

    public /* synthetic */ LongFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String joinToString$default(LongFloatMap longFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return longFloatMap.joinToString(charSequence, charSequence2, charSequence6, i11, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return get_size();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    private LongFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    public final boolean all(@NotNull Function2<? super Long, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        if (!predicate.invoke(Long.valueOf(jArr[i14]), Float.valueOf(fArr[i14])).booleanValue()) {
                            return false;
                        }
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return true;
                }
            }
            if (i11 == length) {
                return true;
            }
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[LOOP:0: B:5:0x0017->B:18:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064 A[SYNTHETIC] */
    public final boolean any(@NotNull Function2<? super Long, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr2[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (predicate.invoke(Long.valueOf(jArr[i14]), Float.valueOf(fArr[i14])).booleanValue()) {
                                return true;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 != length) {
                            i11++;
                        }
                    }
                } else if (i11 != length) {
                    i11++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[LOOP:0: B:5:0x000b->B:18:0x0043, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[SYNTHETIC] */
    public final boolean containsValue(float value) {
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && value == fArr[(i11 << 3) + i13]) {
                            return true;
                        }
                        j11 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 != length) {
                            i11++;
                        }
                    }
                } else if (i11 != length) {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int count(@NotNull Function2<? super Long, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j11) < 128) {
                        int i15 = (i11 << 3) + i14;
                        if (predicate.invoke(Long.valueOf(jArr[i15]), Float.valueOf(fArr[i15])).booleanValue()) {
                            i12++;
                        }
                    }
                    j11 >>= 8;
                }
                if (i13 != 8) {
                    return i12;
                }
            }
            if (i11 == length) {
                return i12;
            }
            i11++;
        }
    }

    public boolean equals(@Nullable Object other) {
        boolean z11;
        long[] jArr;
        long[] jArr2;
        boolean z12 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof LongFloatMap)) {
            return false;
        }
        LongFloatMap longFloatMap = (LongFloatMap) other;
        if (longFloatMap.get_size() != get_size()) {
            return false;
        }
        long[] jArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr4 = this.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr4[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        jArr2 = jArr3;
                        if (fArr[i14] != longFloatMap.get(jArr2[i14])) {
                            return false;
                        }
                    } else {
                        jArr2 = jArr3;
                    }
                    j11 >>= 8;
                    i13++;
                    z12 = z12;
                    jArr3 = jArr2;
                }
                z11 = z12;
                jArr = jArr3;
                if (i12 != 8) {
                    return z11;
                }
            } else {
                z11 = z12;
                jArr = jArr3;
            }
            if (i11 == length) {
                return z11;
            }
            i11++;
            z12 = z11;
            jArr3 = jArr;
        }
    }

    public final void forEach(@NotNull Function2<? super Long, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        block.invoke(Long.valueOf(jArr[i14]), Float.valueOf(fArr[i14]));
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @PublishedApi
    public final void forEachIndexed(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        block.invoke(Integer.valueOf((i11 << 3) + i13));
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void forEachKey(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.keys;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        block.invoke(Long.valueOf(jArr[(i11 << 3) + i13]));
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void forEachValue(@NotNull Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        block.invoke(Float.valueOf(fArr[(i11 << 3) + i13]));
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final float getOrElse(long key, @NotNull Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(key);
        return iFindKeyIndex < 0 ? defaultValue.invoke().floatValue() : this.values[iFindKeyIndex];
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int iHashCode = 0;
        while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        int i14 = (i11 << 3) + i13;
                        long j12 = jArr[i14];
                        iHashCode += Float.hashCode(fArr[i14]) ^ Long.hashCode(j12);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return iHashCode;
                }
            }
            if (i11 == length) {
                return iHashCode;
            }
            i11++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    @NotNull
    public String toString() {
        int i11;
        int i12;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j11 = jArr2[i13];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j11) < 128) {
                            int i17 = (i13 << 3) + i16;
                            i12 = i13;
                            long j12 = jArr[i17];
                            float f11 = fArr[i17];
                            sb2.append(j12);
                            sb2.append("=");
                            sb2.append(f11);
                            i14++;
                            if (i14 < this._size) {
                                sb2.append(',');
                                sb2.append(' ');
                            }
                        } else {
                            i12 = i13;
                        }
                        j11 >>= 8;
                        i16++;
                        i13 = i12;
                    }
                    int i18 = i13;
                    if (i15 != 8) {
                        break;
                    }
                    i11 = i18;
                } else {
                    i11 = i13;
                }
                if (i11 == length) {
                    break;
                }
                i13 = i11 + 1;
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "s.append('}').toString()");
        return string;
    }

    public final boolean contains(long key) {
        if (findKeyIndex(key) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsKey(long key) {
        if (findKeyIndex(key) >= 0) {
            return true;
        }
        return false;
    }

    @PublishedApi
    public final int findKeyIndex(long key) {
        int iHashCode = Long.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j11;
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final float get(long key) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        throw new NoSuchElementException("Cannot find value for key " + key);
    }

    public final float getOrDefault(long key, float defaultValue) {
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        return defaultValue;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(LongFloatMap longFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, Function2 transform, int i12, Object obj) {
        long[] jArr;
        if (obj == null) {
            CharSequence separator = (i12 & 1) != 0 ? ", " : charSequence;
            CharSequence prefix = (i12 & 2) != 0 ? "" : charSequence2;
            CharSequence postfix = (i12 & 4) == 0 ? charSequence3 : "";
            int i13 = (i12 & 8) != 0 ? -1 : i11;
            CharSequence truncated = (i12 & 16) != 0 ? "..." : charSequence4;
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(postfix, "postfix");
            Intrinsics.checkNotNullParameter(truncated, "truncated");
            Intrinsics.checkNotNullParameter(transform, "transform");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(prefix);
            long[] jArr2 = longFloatMap.keys;
            float[] fArr = longFloatMap.values;
            long[] jArr3 = longFloatMap.metadata;
            int length = jArr3.length - 2;
            if (length < 0) {
                sb2.append(postfix);
                break;
            }
            int i14 = 0;
            int i15 = 0;
            loop0: while (true) {
                long j11 = jArr3[i14];
                int i16 = i14;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j11 & 255) < 128) {
                            int i21 = (i16 << 3) + i19;
                            long j12 = jArr2[i21];
                            float f11 = fArr[i21];
                            if (i15 == i13) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i15 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append((CharSequence) transform.invoke(Long.valueOf(j12), Float.valueOf(f11)));
                            i15++;
                        }
                        j11 >>= i17;
                        i19++;
                        i17 = i17;
                        jArr3 = jArr3;
                    }
                    jArr = jArr3;
                    if (i18 == i17) {
                    }
                    sb2.append(postfix);
                    break;
                }
                jArr = jArr3;
                if (i16 == length) {
                    sb2.append(postfix);
                    break;
                }
                i14 = i16 + 1;
                jArr3 = jArr;
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i11) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i11, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        float[] fArr;
        long[] jArr;
        float[] fArr2;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr2 = this.keys;
        float[] fArr3 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr3[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        fArr2 = fArr3;
                        long j12 = jArr2[i16];
                        float f11 = fArr2[i16];
                        if (i12 == limit) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(j12);
                        sb2.append('=');
                        sb2.append(f11);
                        i12++;
                    } else {
                        fArr2 = fArr3;
                    }
                    j11 >>= i13;
                    i15++;
                    fArr3 = fArr2;
                    jArr3 = jArr3;
                    i13 = i13;
                }
                fArr = fArr3;
                jArr = jArr3;
                if (i14 == i13) {
                }
                sb2.append(postfix);
                break;
            }
            fArr = fArr3;
            jArr = jArr3;
            if (i11 == length) {
                sb2.append(postfix);
                break;
            }
            i11++;
            fArr3 = fArr;
            jArr3 = jArr;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a0 A[DONT_INVERT, PHI: r12
      0x00a0: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x0051, B:19:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a2 A[LOOP:0: B:5:0x003f->B:21:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9 A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function2<? super Long, ? super Float, ? extends CharSequence> transform) {
        CharSequence separator2 = separator;
        Intrinsics.checkNotNullParameter(separator2, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr2[i11];
            int i13 = i11;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i13 == length) {
                    sb2.append(postfix);
                    break;
                }
                i11 = i13 + 1;
                separator2 = separator;
            } else {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        int i16 = (i13 << 3) + i15;
                        long j12 = jArr[i16];
                        float f11 = fArr[i16];
                        if (i12 == limit) {
                            sb2.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator2);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j12), Float.valueOf(f11)));
                        i12++;
                    }
                    j11 >>= 8;
                    i15++;
                    separator2 = separator;
                }
                if (i14 == 8) {
                    if (i13 == length) {
                        i11 = i13 + 1;
                        separator2 = separator;
                    }
                }
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i11, @NotNull Function2<? super Long, ? super Float, ? extends CharSequence> transform) {
        CharSequence separator = charSequence;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j11 = jArr2[i12];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j11 & 255) < 128) {
                        int i17 = (i12 << 3) + i16;
                        long j12 = jArr[i17];
                        float f11 = fArr[i17];
                        if (i13 == i11) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i13 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j12), Float.valueOf(f11)));
                        i13++;
                    }
                    j11 >>= i14;
                    i16++;
                    separator = charSequence;
                    i14 = i14;
                }
                if (i15 == i14) {
                }
                sb2.append(postfix);
                break;
            }
            if (i12 == length) {
                sb2.append(postfix);
                break;
            }
            i12++;
            separator = charSequence;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009a A[DONT_INVERT, PHI: r11
      0x009a: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0048, B:20:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x009c A[LOOP:0: B:5:0x0037->B:22:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function2<? super Long, ? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append(postfix);
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j12 = jArr[i16];
                        float f11 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j12), Float.valueOf(f11)));
                        i12++;
                    }
                    j11 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008d A[DONT_INVERT, PHI: r10
      0x008d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003d, B:20:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008f A[LOOP:0: B:5:0x002f->B:22:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0092 A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function2<? super Long, ? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j12 = jArr[i16];
                        float f11 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j12), Float.valueOf(f11)));
                        i12++;
                    }
                    j11 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c A[DONT_INVERT, PHI: r11
      0x008c: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008e A[LOOP:0: B:5:0x0029->B:22:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull Function2<? super Long, ? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j12 = jArr[i16];
                        float f11 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Long.valueOf(j12), Float.valueOf(f11)));
                        i12++;
                    }
                    j11 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0081 A[DONT_INVERT, PHI: r10
      0x0081: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002f, B:20:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0083 A[LOOP:0: B:5:0x0021->B:22:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0086 A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function2<? super Long, ? super Float, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j11 = jArr2[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j11 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        long j12 = jArr[i16];
                        float f11 = fArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Long.valueOf(j12), Float.valueOf(f11)));
                        i12++;
                    }
                    j11 >>= i13;
                    i15++;
                    i13 = i13;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
