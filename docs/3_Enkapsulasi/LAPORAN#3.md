# Laporan Praktikum #3 - Enkapsulasi

## Kompetensi
Setelah melakukan percobaan pada modul ini, mahasiswa memahami konsep:

1. Konstruktor
2. Akses Modifier
3. Atribut/method pada class
4. Intansiasi atribut/method
5. Setter dan getter
6. Memahami notasi pada UML Class Diagram

## Ringkasan Materi

Selama proses Praktikum , saya mengetahui perbedaan class dan object dan juga mecoba proses membuat program berdasarkan Jobsheet

## Percobaan

### Percobaan 4.2
 link kode program : [ini link ke kode program](../../src/2_Class_dan_Object/Mahasiswa.java)

![TestMahasiswa](img/TestMahasiswa.png)

![Mahasiswa](img/Mahasiswa.png)

## Pertanyaan

7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas! 
Jawaban : . Bagian Pendeklarasian atribut pada program Mahasiswa.Java yaitu 
Public Class Mahasiswa {
Public int nim;
Public String nama;
Public String alanat;
Public String Kelas;
8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas! 
Jawaban :Bagian Pendeklarasian method pada program Mahasiswa.Java yaitu
Public void tampilBiodata(){
System.out.println ("Nim  : "+nim);
        System.out.println ("Nama : "+nama);
        System.out.println ("Alamat:"+alamat);
        System.out.println ("Kelas:"+kelas);

9.	Berapa banyak objek yang di instansiasi pada program diatas! 
Jawaban:
10 Yang dilakukan sintaks “mhs1.nim=101” yaitu menampilkan Nim pada program Mahasiswa.java
11.Yang dilakukan sintaks “mhs1.tampilBiodata()” yaitu menampilkan method pada program Mahasiswa.java
12.	Instansiasi 2 objek lagi pada program diatas! 
Mahasiswa mhs2=new Mahasiswa();
        Mhs2.nim=102;
        Mhs2.nama="Asri";
        Mhs2.alamat="Jl.Vinolia No 2B";
        Mhs2.kelas="1B";
        Mhs2.tampilBiodata();
Mahasiswa mhs2=new Mahasiswa();
        Mhs3.nim=103;
        Mhs3.nama="Park Jihoon";
        Mhs3.alamat="Jl.Seoul No 3B";
        Mhs3.kelas="3B";
        Mhs3.tampilBiodata();


### Percobaan 4.3
Contoh link kode program : [ini  link ke kode program](../../src/2_Class_dan_Object/Barang.java)

![Barang](img/Barang.png)

![TestBarang](img/TestBarang.png)

## Pertanyaan
7.	Apakah fungsi argumen dalam suatu method? 
Fungsi argument untuk menyimpan nilai sementara pada method
8.	Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return! 
jika suatu method non void dan return di gunakan untuk menampilkan nilai 

## Tugas
1. Program Toko Game
![Toko Game](img/TokoGame.png)

link kode program : [kode program](../../src/2_Class_dan_Object/TokoGame.java)

2. Program Main Game
![Main Game](img/MainGame.png)

3. Program Lingkaran
![Lingkaran](img/Lingkaran.png)
![MainLingkaran](img/MainLingkaran.png)

link kode program Lingkaran : [ini  ke kode program Lingkaran](../../src/2_Class_dan_Object/Lingkaran.java)


## Kesimpulan

Dari Apa yang saya telah kerjakan saya memahami apa itu class dan object mencoba program dan mejalankan tugas 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Alief Faizal Imansyah)***