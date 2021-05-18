package com.example.myedt

import android.os.Parcel
import android.os.Parcelable

data class Enseignant (
    var nom: String? ="",
    var description: String? ="",
    var biographie: String? ="",
     ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nom)
        parcel.writeString(description)
        parcel.writeString(biographie)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Seance> {
        override fun createFromParcel(parcel: Parcel): Seance {
            return Seance(parcel)
        }

        override fun newArray(size: Int): Array<Seance?> {
            return arrayOfNulls(size)
        }
    }
}