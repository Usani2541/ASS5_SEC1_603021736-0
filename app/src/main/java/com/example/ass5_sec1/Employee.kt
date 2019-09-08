package com.example.ass5_sec1

import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee ( val name: String,val gender: String, val email: String, val salary: Int) : Parcelable{
}