
	import java.util.Scanner;
	import org.omg.CORBA.PUBLIC_MEMBER;

	public class ruangkelas {
		Scanner in = new Scanner(System.in);
	    ruang ambil = new ruang();
	    public void input_identitas_ruang_kelas(){
	        System.out.println("input ruang kelas");
	        ambil.setNama_ruang(in.next());
	        System.out.println("input lokasi ruang kelas");
	        ambil.setLokasi_ruang(in.next());
	        System.out.println("pilih fakultas");
	        ambil.setFakultas(in.next());
	    }
	    public void input_kondisi_ruang_kelas(){
	        System.out.println("masukan panjang");
	        ambil.setPanjang_ruang(in.nextInt());
	        System.out.println("masukan lebar");
	        //hitung_bentuk_ruang();
	        ambil.setLebar_ruang(in.nextInt());
	        System.out.println("masukan jumlah kursi");
	        ambil.setJumlah_kursi(in.nextInt());
	        System.out.println("masukan jumlah pintu");
	        ambil.setJumlah_pintu(in.nextInt());
	        System.out.println("masukan jumlah jendela");
	        ambil.setJumlah_jendela(in.nextInt());
	    }
	    double hitung_luas_ruang(){
	        return ambil.getPanjang_ruang()* ambil.getLebar_ruang();
	    }
	    public void hitung_bentuk_ruang(){
	        if(ambil.getPanjang_ruang()!= ambil.getLebar_ruang()){
	            System.out.println("persegi panjang");
	        }else{
	            System.out.println("bentuk tidak sesuai kembali memasukan data");
	            input_kondisi_ruang_kelas();            
	        }        
	    }
	    public void hitung_rasio_luas(){
	        double hasil;
	        hasil = hitung_luas_ruang()/ ambil.getJumlah_kursi();
	        if(hasil<=0.5){
	            System.out.println("rasio sesuai");
	        } else {
	            System.out.println("tidak sesuai kembali memasukan data");
	            input_kondisi_ruang_kelas();
	        }
	    }
	    public void analisis_pintu_dan_jendela(){
	        if (ambil.getJumlah_pintu()>=2 && ambil.getJumlah_jendela()>=1){
	            System.out.println("kelas layak dipakai");
	        }else{
	            System.out.println("kelas tidak layak");
	        }
	    }
	    public void kondisi_dan_posisi_sarana(){
	        System.out.println("masukan jumlah steker atau stop kontak");
	        ambil.setJumlah_steker(in.nextInt());
	        System.out.println("masukan kondisi steker");
	        ambil.setKondisi_steker(in.next());
	        System.out.println("posisi steker : ");
	        ambil.setPosisi_steker(in.next());
	        System.out.println("input jumlah kabel LCD");
	        ambil.setJumlah_kabel_LCD(in.nextInt());
	        System.out.println("kondisi kabel LCD");
	        ambil.setKondisi_kabel_LCD(in.next());
	        System.out.println("posisi kabel LCD");
	        ambil.setPosisi_kabel_LCD(in.next());
	        System.out.println("jumlah lampu");
	        ambil.setJumlah_lampu(in.nextInt());
	        System.out.println("kondisi lampu");
	        ambil.setKondisi_lampu(in.next());
	        System.out.println("jumlah kipas angin");
	        ambil.setJumlah_kipas_angin(in.nextInt());
	        System.out.println("kondisi kipas angin");
	        ambil.setKondisi_kipas_angin(in.next());
	        System.out.println("jumlah AC");
	        ambil.setJumlah_AC(in.nextInt());
	        System.out.println("kondisi AC");
	        ambil.setKondisi_AC(in.next());
	        System.out.println("posisi AC");
	        ambil.setPosisi_AC(in.next());
	        System.out.println("pilih SSID");
	        ambil.setSSID(in.nextInt());
	        System.out.println("bandwidth");
	        ambil.setBandwidth(in.next());
	        System.out.println("jumlah cctv");
	        ambil.setJumlah_CCTV(in.nextInt());
	        System.out.println("kondisi cctv");
	        ambil.setKondisi_CCTV(in.next());
	        System.out.println("posisi cctv");
	        ambil.setPosisi_CCTV(in.next());
	    }
	    public void analisis_kelistrikan(){
	        if ((ambil.getJumlah_steker()>=4 )&&( ambil.getKondisi_steker().equalsIgnoreCase("baik"))&&(ambil.getPosisi_steker().equalsIgnoreCase("dipojok dan dekat dosen"))){
	            System.out.println("sesuai atau layak");
	        }else{
	            System.out.println("tidak sesuai");
	        }
	    }
	    public void analisis_LCD(){
	        if ((ambil.getJumlah_kabel_LCD()>=1)&&(ambil.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi")&&(ambil.getPosisi_kabel_LCD().equalsIgnoreCase("dekat dosen")))){
	            System.out.println("layak atau sesuai");
	        }else{
	            System.out.println("tidak layak");
	        }
	    }
	    public void analisis_lampu(){
	       // if ((ambil.getJumlah_lampu()>=18)(ambil.getKondisi_lampu().equals("baik")))
	    }
	    public void analisis_kipas_angin(){
	      //  if (ambil.getJumlah_kipas_angin()>=2 && ambil.getKondisi_kipas_angin())
	    }
	    public void analisis_AC(){
	        
	    }
	    public void analisis_internet(){
	        
	    }
	    public void analisis_CCTV(){
	        
	    }
	    public void input_lingkungan_ruang_kelas(){
	        System.out.println("");
	    }
	    public void analisis_kebersihan(){    	
	    }

	public void input_kenyamanan_ruang_kelas(){
		System.out.println("masukan kebisingan");
	    ambil.setKebisingan(in.nextLine());
	    System.out.println("masukkan bau");
	    ambil.setBau(in.nextLine());
	    System.out.println("masukkan kebocoran");
	    ambil.setKebocoran(in.nextLine());
	    System.out.println("masukkan kerusakan");
	    ambil.setKerusakan(in.nextLine());
	    System.out.println("masukkan keausan");
	    ambil.setKeausan(in.nextLine());   
	}
	public void analisis_kebisingan(){
		if ("tidak bising".equals(ambil.getKebisingan())) {
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
	}
	public void analisis_bau(){
		if("tidak bau".equals(ambil.getBau())){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
	}
	public void analisis_kebocoran(){
		if("tidak bocor".equals(ambil.getKebocoran())){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
	}
	public void analisis_kerusakan(){
		if("tidak rusak".equals(ambil.getKerusakan())){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak sesuai");
		}
	}
	public void analisis_keausan(){
		if("tidak aus".equals(ambil.getKeausan())){
			System.out.println("sesuai");
		}else{
			System.out.println("tidak seasuai");
		}
	}
	}