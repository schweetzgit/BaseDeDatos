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
		void imprimeAlumno(){
			cout<<"\n Numero de cuenta: "<<numcta;
			cout<<"\n Nombre: "<<nombre;
		}
		void listarPersonasAlmacenadas(){
			FILE *archivo;
			Alumno aux;
			char respuesta;
			char direccion[150];
			cout<<"\n El arvicho se encuentra junto al programa? (S/N) \n ->";
			cin>>respuesta;
			if((respuesta!='S')&&(respuesta!='s')){
				cout<<"Ingresa la direccion donde se encuentra el archivo: \n-> ";
				fflush(stdin);
				cin.getline(direccion, 150, '\n');
				archivo = fopen(direccion,"r");
			}
			else{
				archivo = fopen("baseAlumno.txt","r");
			}
			if(archivo == NULL){
				cout<<"\n Error en apertura de archivo";
				cin.get();
				return;
			}
			while(!feof(archivo)){
				// fendofile. Verifica si se alcanzo el fin de archivo.
				fscanf(archivo,"%d\n",&aux.numcta);
				fflush(stdin);
				fgets(aux.nombre,150,archivo);//admiten espacios en blanco
				aux.imprimeAlumno();
			}
			cout<<"\n\n Se muestran todos los registros. \n Pulse tecla para continuar";
			getch();
			system("cls");
			fclose(archivo);
		}
		void buscarRegistro(){
			FILE *archivo;
			int idBuscado;
			struct Alumno aux;
			char respuesta;
			char direccion[150];
			
			cout<<"\n El arvicho se encuentra junto al programa? (S/N) \n ->";
			cin>>respuesta;
			if((respuesta!='S')&&(respuesta!='s')){
				cout<<" Ingresa la direccion donde se encuentra el archivo: \n-> ";
				fflush(stdin);
				cin.getline(direccion, 150, '\n');
				archivo = fopen(direccion,"r");
			}
			else{
				archivo = fopen("baseAlumno.txt","r");
			}
			if(archivo == NULL){
				cout<<"\n Error en apertura de archivo. \nPulse tecla para continuar";
				cin.get();
				return;
			}
			
			cout<<"\n Ingresar el numero de cuenta a buscar: ";
		    cin>>idBuscado;
		    
			while(!feof(archivo)){
				fscanf(archivo,"%d\n",&aux.numcta);
				fflush(stdin);
				fgets(aux.nombre,150,archivo);
				if(idBuscado == aux.numcta){
					cout<<"\n El alumno con numero de cuenta: "<<aux.numcta<<" se ha encontrado.\n";
				 	aux.imprimeAlumno();
					cout<<"\n\n Pulse tecla para continuar";
				    cin.get();
					system("cls");
				    fclose(archivo);
					return;
			    }
			}
			cout<<"\n El registro no se encuentra almacenado.\n Pulse tecla para continuar";	
			cin.get();
			system("cls");
		    fclose(archivo);
			return;
		}
}alum;

main(){
	int opc;
	alum alumX;
	do{
		cout<<"\n Consulta de datos\n";
		cout<<"\n 1. Listar alumnos";
		cout<<"\n 2. Buscar registro";
		cout<<"\n 3. Salir";
		cout<<"\n Elija una opcion: ";
		cin>>opc;
		switch(opc){
			case 1:
				alumX.listarPersonasAlmacenadas();
				//system("cls");
				break;
			case 2:
				alumX.buscarRegistro();
				break;   
			case 3: 
				exit(0);
				break;
			default: 
				cout<<"\n Opcion incorrecta. Vuelva a elegir";			
				getch();
		}
	}while(opc!=3);
}
