package androidx.work;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.TypeConverter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public final class Data {

    @SuppressLint({"MinMaxConstant"})
    public static final int MAX_DATA_BYTES = 10240;
    Map<String, Object> mValues;
    private static final String TAG = Logger.tagWithPrefix("Data");
    public static final Data EMPTY = new Builder().build();

    public static final class Builder {
        private Map<String, Object> mValues = new HashMap();

        @NonNull
        public Builder putAll(@NonNull Data data) {
            putAll(data.mValues);
            return this;
        }

        @NonNull
        public Data build() throws Throwable {
            Data data = new Data((Map<String, ?>) this.mValues);
            Data.toByteArrayInternal(data);
            return data;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder put(@NonNull String str, @Nullable Object obj) {
            if (obj == null) {
                this.mValues.put(str, null);
                return this;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.mValues.put(str, obj);
                return this;
            }
            if (cls == boolean[].class) {
                this.mValues.put(str, Data.convertPrimitiveBooleanArray((boolean[]) obj));
                return this;
            }
            if (cls == byte[].class) {
                this.mValues.put(str, Data.convertPrimitiveByteArray((byte[]) obj));
                return this;
            }
            if (cls == int[].class) {
                this.mValues.put(str, Data.convertPrimitiveIntArray((int[]) obj));
                return this;
            }
            if (cls == long[].class) {
                this.mValues.put(str, Data.convertPrimitiveLongArray((long[]) obj));
                return this;
            }
            if (cls == float[].class) {
                this.mValues.put(str, Data.convertPrimitiveFloatArray((float[]) obj));
                return this;
            }
            if (cls == double[].class) {
                this.mValues.put(str, Data.convertPrimitiveDoubleArray((double[]) obj));
                return this;
            }
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }

        @NonNull
        public Builder putAll(@NonNull Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z11) {
            this.mValues.put(str, Boolean.valueOf(z11));
            return this;
        }

        @NonNull
        public Builder putBooleanArray(@NonNull String str, @NonNull boolean[] zArr) {
            this.mValues.put(str, Data.convertPrimitiveBooleanArray(zArr));
            return this;
        }

        @NonNull
        public Builder putByte(@NonNull String str, byte b11) {
            this.mValues.put(str, Byte.valueOf(b11));
            return this;
        }

        @NonNull
        public Builder putByteArray(@NonNull String str, @NonNull byte[] bArr) {
            this.mValues.put(str, Data.convertPrimitiveByteArray(bArr));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d11) {
            this.mValues.put(str, Double.valueOf(d11));
            return this;
        }

        @NonNull
        public Builder putDoubleArray(@NonNull String str, @NonNull double[] dArr) {
            this.mValues.put(str, Data.convertPrimitiveDoubleArray(dArr));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f11) {
            this.mValues.put(str, Float.valueOf(f11));
            return this;
        }

        @NonNull
        public Builder putFloatArray(@NonNull String str, @NonNull float[] fArr) {
            this.mValues.put(str, Data.convertPrimitiveFloatArray(fArr));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i11) {
            this.mValues.put(str, Integer.valueOf(i11));
            return this;
        }

        @NonNull
        public Builder putIntArray(@NonNull String str, @NonNull int[] iArr) {
            this.mValues.put(str, Data.convertPrimitiveIntArray(iArr));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j11) {
            this.mValues.put(str, Long.valueOf(j11));
            return this;
        }

        @NonNull
        public Builder putLongArray(@NonNull String str, @NonNull long[] jArr) {
            this.mValues.put(str, Data.convertPrimitiveLongArray(jArr));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @Nullable String str2) {
            this.mValues.put(str, str2);
            return this;
        }

        @NonNull
        public Builder putStringArray(@NonNull String str, @NonNull String[] strArr) {
            this.mValues.put(str, strArr);
            return this;
        }
    }

    public Data() {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Boolean[] convertPrimitiveBooleanArray(@NonNull boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i11 = 0; i11 < zArr.length; i11++) {
            boolArr[i11] = Boolean.valueOf(zArr[i11]);
        }
        return boolArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Byte[] convertPrimitiveByteArray(@NonNull byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = Byte.valueOf(bArr[i11]);
        }
        return bArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Double[] convertPrimitiveDoubleArray(@NonNull double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr2[i11] = Double.valueOf(dArr[i11]);
        }
        return dArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Float[] convertPrimitiveFloatArray(@NonNull float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr2[i11] = Float.valueOf(fArr[i11]);
        }
        return fArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Integer[] convertPrimitiveIntArray(@NonNull int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Long[] convertPrimitiveLongArray(@NonNull long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            lArr[i11] = Long.valueOf(jArr[i11]);
        }
        return lArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean[] convertToPrimitiveArray(@NonNull Boolean[] boolArr) {
        boolean[] zArr = new boolean[boolArr.length];
        for (int i11 = 0; i11 < boolArr.length; i11++) {
            zArr[i11] = boolArr[i11].booleanValue();
        }
        return zArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Data.class != obj.getClass()) {
            return false;
        }
        Data data = (Data) obj;
        Set<String> setKeySet = this.mValues.keySet();
        if (!setKeySet.equals(data.mValues.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.mValues.get(str);
            Object obj3 = data.mValues.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public Data(@NonNull Data data) {
        this.mValues = new HashMap(data.mValues);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    @TypeConverter
    public static Data fromByteArray(@NonNull byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e11;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i11 = objectInputStream.readInt(); i11 > 0; i11--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e12) {
                            Log.e(TAG, "Error in Data#fromByteArray: ", e12);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e13) {
                        e11 = e13;
                        Log.e(TAG, "Error in Data#fromByteArray: ", e11);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e14) {
                                Log.e(TAG, "Error in Data#fromByteArray: ", e14);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e15) {
                        e11 = e15;
                        Log.e(TAG, "Error in Data#fromByteArray: ", e11);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (IOException e16) {
                    Log.e(TAG, "Error in Data#fromByteArray: ", e16);
                }
            } catch (IOException e17) {
                e = e17;
                Throwable th2 = e;
                objectInputStream = null;
                e11 = th2;
                Log.e(TAG, "Error in Data#fromByteArray: ", e11);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new Data(map);
            } catch (ClassNotFoundException e18) {
                e = e18;
                Throwable th3 = e;
                objectInputStream = null;
                e11 = th3;
                Log.e(TAG, "Error in Data#fromByteArray: ", e11);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new Data(map);
            } catch (Throwable th4) {
                th = th4;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e19) {
                        Log.e(TAG, "Error in Data#fromByteArray: ", e19);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e21) {
                    Log.e(TAG, "Error in Data#fromByteArray: ", e21);
                    throw th;
                }
            }
            return new Data(map);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @NonNull
    @TypeConverter
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] toByteArrayInternal(@NonNull Data data) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.size());
                    for (Map.Entry<String, Object> entry : data.mValues.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e11) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e11);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e12);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e13) {
                    e = e13;
                    objectOutputStream = objectOutputStream2;
                    Log.e(TAG, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e14) {
                            Log.e(TAG, "Error in Data#toByteArray: ", e14);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e15) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e15);
                    }
                    return byteArray;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e16) {
                            Log.e(TAG, "Error in Data#toByteArray: ", e16);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e17) {
                        Log.e(TAG, "Error in Data#toByteArray: ", e17);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e18) {
            e = e18;
        }
    }

    public boolean getBoolean(@NonNull String str, boolean z11) {
        Object obj = this.mValues.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z11;
    }

    @Nullable
    public boolean[] getBooleanArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Boolean[]) {
            return convertToPrimitiveArray((Boolean[]) obj);
        }
        return null;
    }

    public byte getByte(@NonNull String str, byte b11) {
        Object obj = this.mValues.get(str);
        return obj instanceof Byte ? ((Byte) obj).byteValue() : b11;
    }

    @Nullable
    public byte[] getByteArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Byte[]) {
            return convertToPrimitiveArray((Byte[]) obj);
        }
        return null;
    }

    public double getDouble(@NonNull String str, double d11) {
        Object obj = this.mValues.get(str);
        return obj instanceof Double ? ((Double) obj).doubleValue() : d11;
    }

    @Nullable
    public double[] getDoubleArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Double[]) {
            return convertToPrimitiveArray((Double[]) obj);
        }
        return null;
    }

    public float getFloat(@NonNull String str, float f11) {
        Object obj = this.mValues.get(str);
        return obj instanceof Float ? ((Float) obj).floatValue() : f11;
    }

    @Nullable
    public float[] getFloatArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Float[]) {
            return convertToPrimitiveArray((Float[]) obj);
        }
        return null;
    }

    public int getInt(@NonNull String str, int i11) {
        Object obj = this.mValues.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i11;
    }

    @Nullable
    public int[] getIntArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Integer[]) {
            return convertToPrimitiveArray((Integer[]) obj);
        }
        return null;
    }

    @NonNull
    public Map<String, Object> getKeyValueMap() {
        return Collections.unmodifiableMap(this.mValues);
    }

    public long getLong(@NonNull String str, long j11) {
        Object obj = this.mValues.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j11;
    }

    @Nullable
    public long[] getLongArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof Long[]) {
            return convertToPrimitiveArray((Long[]) obj);
        }
        return null;
    }

    @Nullable
    public String getString(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public String[] getStringArray(@NonNull String str) {
        Object obj = this.mValues.get(str);
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    public <T> boolean hasKeyWithValueOfType(@NonNull String str, @NonNull Class<T> cls) {
        Object obj = this.mValues.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public int hashCode() {
        return this.mValues.hashCode() * 31;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public int size() {
        return this.mValues.size();
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.mValues.isEmpty()) {
            for (String str : this.mValues.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.mValues.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    @NonNull
    public byte[] toByteArray() {
        return toByteArrayInternal(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Data(@NonNull Map<String, ?> map) {
        this.mValues = new HashMap(map);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] convertToPrimitiveArray(@NonNull Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = bArr[i11].byteValue();
        }
        return bArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static int[] convertToPrimitiveArray(@NonNull Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i11 = 0; i11 < numArr.length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return iArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static long[] convertToPrimitiveArray(@NonNull Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i11 = 0; i11 < lArr.length; i11++) {
            jArr[i11] = lArr[i11].longValue();
        }
        return jArr;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static float[] convertToPrimitiveArray(@NonNull Float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr2[i11] = fArr[i11].floatValue();
        }
        return fArr2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static double[] convertToPrimitiveArray(@NonNull Double[] dArr) {
        double[] dArr2 = new double[dArr.length];
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr2[i11] = dArr[i11].doubleValue();
        }
        return dArr2;
    }
}
