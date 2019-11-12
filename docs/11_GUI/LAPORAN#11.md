# Laporan Praktikum #11 - GUI (Graphical User Interface)  

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu: 
1. Membuat aplikasi Graphical User Interface sederhana dengan bahasa pemrograman java; 
2. Mengenal komponen GUI seperti frame, label, textfield, combobox, radiobutton, checkbox, textarea, menu, serta table; 
3. Menambahkan event handling pada aplikasi GUI. 
 

## Ringkasan Materi
GUI 

Agar interaksi antara user dengan program tidak membosankan diperlukanlah sebuah interface yang menghubungkan antara user dengan  program dengan tampilan grafis, interface ini dinamakan dengan GUI(Graphical User Interface). Dalam pemrograman GUI terdapat beberapa bagian yang harus dilakukan yaitu: 
1. Membuat windows utama  
2. Menentukan komponen-komponen pendukung    program  
3. Menentukan tata letak layout agar nantinya semua komponen–komponen yang sudah dipersiapkan bisa diaatur sedemikian rupa  
4. Event Handling dari sebuah aktivitas, seperti penekanan button, check box dan lain-lain
 
Java Swing merupakan bagian dari JFC (Java Foundation Classes) yang menyediakan API untuk menangani hal yang berkaitan dengan GUI bagi program Java.  Kita bisa membedakan komponen Swing dengan komponen AWT, di mana pada umumnya kelas-kelas yang berada dalam komponen Swing diawali dengan huruf J, misal: JButton, JLabel, JTextField, JRadioButton. 
 
 
 
## Percobaan

### Percobaan 1 JFrame HelloGUI 

1. Class HelloGui:
  ![HelloGui](img/HelloGui.PNG)

   link kode program: 
   [link ke kode program ](../../src/HelloGui.java)

### Percobaan 2 Menangani Input Pada GUI

1. Class MyInput:
  ![MyInputForm](img/Myinputform.PNG)

   link kode program: 
   [link ke kode program ](../../src/MyInputForm.java)

2. Class Main:
   ![Main](img/Main.PNG)
   
   link kode program : 
   [link ke kode program](../../src/Main.java)

### Pertanyaan Percobaan 2
1. Modifikasi kode program dengan menambahkan JButton baru untuk melakukan fungsi perhitungan penambahan, sehingga ketika button di klik (event click) maka akan menampilkan hasil penambahan dari nilai A dan B
  
### Jawaban Pertanyaan    
1. Jawaban:
  ![Main](img/Main.PNG)

   link kode program: 
   [link ke kode program ](../../src/Main.java)

### Percobaan 3 Manajemen Layout 
1. Class Border:
  ![Border](img/Border.PNG)

   link kode program: 
   [link ke kode program ](../../src/Border.java)

2. Class Grid:
  ![Grid](img/Grid.PNG)

   link kode program: 
   [link ke kode program ](../../src/Grid.java)

3. Class Box:
  ![Box](img/Box.PNG)
 
   link kode program: 
   [link ke kode program ](../../src/Box.java)

4. Class LayoutGUI:
  ![LayoutGUI](img/LayoutGui.PNG)

   link kode program: 
   [link ke kode program ](../../src/LayoutGUI.java)

* Hasil Border Layout:
  ![Border Layout](img/Border.PNG)

* Hasil Grid Layout:
  ![Grid Layout](img/Grid.PNG)

* Hasil Box Layout:
  ![Box Layout](img/Box.PNG)


### Pertanyaan Percobaan 3

1. Apa perbedaan dari Grid Layout, Box Layout dan Border Layout? 

2. Apakah fungsi dari masing-masing kode berikut? 
  ![Soal](img/Border.PNG)
  
### Jawaban Pertanyaan

1. Perbedaan:
    * Perbedaan pertama ada pada setLayout yang digunakan
    * Selanjutnya ada pada tombolnya

2. Fungsi masing-masing kode:
    * Inisiasi object dari masing-masing layout pada object JFrame
    * fungsi setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); adalah pada saat menekan tombol close maka akan keluar dari program
    * fungsi frame.setVisible(true); adalah untuk menampilkan atau tidak layout yang sudah di buat sebelumnya


### Percobaan 4 Membuat GUI Melalui IDE Netbeans 

1. Class Swing Design:
  ![Design](img/Design.PNG)

2. Selanjutnya, setelah design selesai pindah ke tab Source kemudian pada kelas Swing tambahkan variable yang dibutuhkan
  ![Source](img/Design.PNG)

3. Komponen JButton cmdtampil
  ![Source](img/cmdTampil.PNG)

4. Komponen JButton cmdclear 
  ![Source](img/cmdClear.PNG)

   link kode program: 
   [link ke kode program ](../../src/Swing.java)

5. Hasil Run Program:
   ![Hasil](img/Swing.PNG)

### Pertanyaan Percobaan 4

1. Apakah fungsi dari kode berikut? 

2.  Mengapa pada bagian logika checkbox dan radio button digunakan multiple if ? 

3. Lakukan modifikasi pada program untuk melakukan menambahkan inputan berupa alamat dan berikan fungsi pemeriksaan pada nilai Alamat tersebut jika belum diisi dengan menampilkan pesan peringatan 

### Jawaban Pertanyaan

1. Fungsi dari kode program tersebut adalah untuk menjalankan fungsi scroll

2. Multiple if digunakan untuk menampilkan pilihan saat dipilih karena kalau multiple if nya dihilangkan maka hasilnya akan null

### Tugas
Buatlah Sebuah Program yang mempunyai fungsi seperti kalkulator (mampu menjumlahkan, mengurangkan, mengalikan dan membagikan. Dengan tampilan seperti berikut.  
 ![Tugas](img/Kalkuator.PNG)

### Hasil Tugas

1.
![Tugas](img/Kalkuator.PNG)
2.
![Tugas](img/Kalkuator.PNG)
3.
![Tugas](img/Kalkuator.PNG)

## Kesimpulan

Dari percobaan dan tugas diatas kita sudah mempelajari tentang konsep dan contoh dari JFrame HelloGUI, Menangani Input Pada GUI, Manajemen Layout,
Membuat GUI Melalui IDE Netbeans, dan JTabPane, JTtree, JTabl. Melalui jobsheet ini melatih kesabaran dan ketelitian dalam mebuat program 


## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(Alief Faizal Imansyah)***