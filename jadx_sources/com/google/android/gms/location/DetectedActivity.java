package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes45.dex */
@SafeParcelable.Class(creator = "DetectedActivityCreator")
@SafeParcelable.Reserved({1000})
public class DetectedActivity extends AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;

    @SafeParcelable.Field(m12889id = 1)
    int zzb;

    @SafeParcelable.Field(m12889id = 2)
    int zzc;

    @RecentlyNonNull
    public static final Comparator<DetectedActivity> zza = new zzq();

    @RecentlyNonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();

    @ShowFirstParty
    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.zzb == detectedActivity.zzb && this.zzc == detectedActivity.zzc) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int i11 = this.zzb;
        if (i11 > 22 || i11 < 0) {
            return 4;
        }
        return i11;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(m12890id = 1) int i11, @SafeParcelable.Param(m12890id = 2) int i12) {
        this.zzb = i11;
        this.zzc = i12;
    }

    @RecentlyNonNull
    public String toString() {
        String string;
        int type = getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            if (type != 5) {
                                if (type != 7) {
                                    if (type != 8) {
                                        if (type != 16) {
                                            if (type != 17) {
                                                string = Integer.toString(type);
                                            } else {
                                                string = "IN_RAIL_VEHICLE";
                                            }
                                        } else {
                                            string = "IN_ROAD_VEHICLE";
                                        }
                                    } else {
                                        string = "RUNNING";
                                    }
                                } else {
                                    string = "WALKING";
                                }
                            } else {
                                string = "TILTING";
                            }
                        } else {
                            string = "UNKNOWN";
                        }
                    } else {
                        string = "STILL";
                    }
                } else {
                    string = "ON_FOOT";
                }
            } else {
                string = "ON_BICYCLE";
            }
        } else {
            string = "IN_VEHICLE";
        }
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 48);
        sb2.append("DetectedActivity [type=");
        sb2.append(string);
        sb2.append(", confidence=");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
