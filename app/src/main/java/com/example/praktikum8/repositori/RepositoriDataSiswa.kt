package com.example.praktikum8.repositori

import com.example.praktikum8.modeldata.DataSiswa
import com.example.praktikum8.apiservice.ServiceApiSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
    suspend fun getSatuSiswa(id:Int) : DataSiswa


}

class jaringanRepositoryDataSiswa (
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2
    .Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}