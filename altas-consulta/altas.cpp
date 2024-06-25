#include<iostream>
#include<conio.h>
using namespace std;
/* Colunga Aguilar Alma Carolina
   Lopez Zamora Ernesto */
typedef struct Alumno{
	private:
		int numcta;
		char nombre[150];
	public:
		void leerAlumno(){
			cout<<"\n Alumnos\n";
			cout<<" Numero de cuenta: ";
			cin>>numcta;
			cout<<" Nombre: ";
			fflush(stdin);
			gets(nombre);
		}
		void guardarRegistro(){
			FILE *archivo;
			archivo = fopen("baseAlumno.txt","a");
			if(archivo == NULL){
				cout<<"\n Error en apertura de archivo";
				cin.get();
				return;
			}
			fprintf(archivo,"\n %d", numcta);
			fprintf(archivo,"\n %s", nombre);
			fclose(archivo);
			cout<<"\n Datos almacenados con exito.";
			getch();
		}
}alum;
main(){
	int opc;
	alum alumX;
	do{
		cout<<"\n Lectura de datos\n";
		cout<<"\n 1. Leer datos";
		cout<<"\n 2. Salir";
		cout<<"\n Elija una opcion: ";
		cin>>opc;
		switch(opc){
			case 1:
				alumX.leerAlumno();
				alumX.guardarRegistro();
				system("cls");
				break;
			case 2: 
				exit(0);
				break;
			default: 
				cout<<"\n Opcion incorrecta. Vuelva a elegir";			
				getch();
		}
	}while(opc!=2);
}
